/**
 * 
 */
package com.test.consul.ribbon.fiegn.data.initiaze;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.test.consul.ribbon.fiegn.pojo.Volunteer;

/**
 * @author MGupta
 *
 */
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class DataInitializer {

	public static List <Volunteer> vols = new ArrayList<>();
	public DataInitializer() {
		super();
		System.out.println("Initializing data...");
		initializeData();
	}
	public void initializeData() {
		Volunteer vol1 = new Volunteer();
		Volunteer vol2 = new Volunteer();
		Volunteer vol3 = new Volunteer();
		vol1.setFirstname("Jason");
		vol1.setLastname("Brenner");
		vol1.addService("droptoschool");
		vol1.addService("donateblood");
		vol2.setFirstname("David");
		vol2.setLastname("Kelly");
		vol2.addService("droptoschool");
		vol3.setFirstname("John");
		vol3.setLastname("Lebannon");
		vol3.addService("donateblood");
		vols.add(vol1);
		vols.add(vol2);
		vols.add(vol3);
		System.out.println("Number of Volunteers:" + vols.size());
	}
}
