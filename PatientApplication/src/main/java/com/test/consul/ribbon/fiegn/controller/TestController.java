/**
 * 
 */
package com.test.consul.ribbon.fiegn.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.test.consul.ribbon.fiegn.proxy.VolunteerServiceProxy;

/**
 * @author MGupta
 *
 */
@RestController
public class TestController {

	@Value("${service.volunteer.url}")
	private String serviceurl;

	@Autowired
	RestTemplate restTemplate;
	
	protected VolunteerServiceProxy proxy;

	@Autowired
	public TestController(VolunteerServiceProxy proxy) {
		super();
		this.proxy = proxy;
	}

	@GetMapping("/")
	public String home() {
		return "Hello World from Patient application";
	}

	/**
	 * Method to fetch the voluteers for the given service name.</br>
	 * @param aidname
	 * @return
	 */
	@GetMapping(value = "/volunteers/{aidname}")
	public List < String > listVolunteers(@PathVariable("aidname") String aidname) {
		System.out.println("listVolunteers using RestTemplate");
		String[] volnames = restTemplate.getForObject(serviceurl + "/volunteers/{servicename}", String[].class, aidname);
		List < String > volunteers = Arrays.asList(volnames);
		return volunteers;
	}
	
	/**
	 * Method to fetch the voluteers for the given service name using feign client.</br>
	 * 
	 * @param aidname
	 * @return
	 */
	@GetMapping(value = "/volunteers/fiegnClient/{aidname}")
	public List < String > listVolunteersFiegnClient(@PathVariable("aidname") String aidname) {
		System.out.println("listVolunteers using Fiegn client");
		return proxy.listVolunteers(aidname);//invoking using feign client
	}
}
