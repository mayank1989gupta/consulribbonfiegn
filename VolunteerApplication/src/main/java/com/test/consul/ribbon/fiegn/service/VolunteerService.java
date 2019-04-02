/**
 * 
 */
package com.test.consul.ribbon.fiegn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.consul.ribbon.fiegn.data.initiaze.DataInitializer;
import com.test.consul.ribbon.fiegn.pojo.Volunteer;

/**
 * @author MGupta
 *
 */
@Service
public class VolunteerService {

	@Autowired
	DataInitializer initializer;

	public VolunteerService() {
		super();
	}

	/**
	 * 
	 * @param servicename
	 * @return
	 */
	public List<String> findVolunteers(String servicename) {
		List <String> volnames = new ArrayList<>();

		List <Volunteer> vols = initializer.vols; 
		for (Volunteer vol: vols) {
			System.out.println(vol.getServices() + ":" + vol.getFirstname()); 
			if (vol.getServices().contains(servicename)) { 
				volnames.add(vol.getFirstname() + " " + vol.getLastname()); 
			} 
		}

		return volnames;
	}
}
