/**
 * 
 */
package com.test.consul.ribbon.fiegn.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author MGupta
 *
 */
@FeignClient(name = "VolunteerApp")
public interface VolunteerServiceProxy {

	@GetMapping(value = "/volunteers/{servicename}")
	public List<String> listVolunteers(@PathVariable("servicename") String servicename);
}
