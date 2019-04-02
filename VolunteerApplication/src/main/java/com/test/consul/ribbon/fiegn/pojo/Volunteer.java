/**
 * 
 */
package com.test.consul.ribbon.fiegn.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author MGupta
 *
 */
public class Volunteer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String firstname;
	private String lastname;
	private String userid;
	private Set <String> services = new HashSet<>();
	
	//Default const
	public Volunteer( ) {}
	
	/**
	 * @param id
	 * @param firstname
	 * @param lastname
	 * @param userid
	 * @param services
	 */
	public Volunteer(Long id, String firstname, String lastname, String userid, Set<String> services) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.userid = userid;
		this.services = services;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * @return the services
	 */
	public Set<String> getServices() {
		return services;
	}
	/**
	 * @param services the services to set
	 */
	public void addService(String service) {
		this.services.add(service);
	}
}
