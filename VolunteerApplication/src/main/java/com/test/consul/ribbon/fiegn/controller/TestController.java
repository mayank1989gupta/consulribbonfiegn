/**
 * 
 */
package com.test.consul.ribbon.fiegn.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.consul.ribbon.fiegn.service.VolunteerService;

/**
 * @author MGupta
 *
 */
@RestController
public class TestController {

	@Autowired
	VolunteerService volunteerService;

	private static final Logger LOGGER = Logger.getLogger(TestController.class.getName());
	
	//Test method
	@GetMapping("/")
	public String home() {
		return "Hello World from Volunteer application";
	}

	@GetMapping(value = "/volunteers/{servicename}")
	public List<String> listVolunteers(@PathVariable("servicename") String servicename) {
		LOGGER.info("Volunteer App --> Responding to Patient**********");
		return volunteerService.findVolunteers(servicename);
	}
}
