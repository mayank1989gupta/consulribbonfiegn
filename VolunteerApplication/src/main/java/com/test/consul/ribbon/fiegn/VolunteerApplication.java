/**
 * 
 */
package com.test.consul.ribbon.fiegn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author MGupta
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@EnableDiscoveryClient
public class VolunteerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(VolunteerApplication.class, args);
	}

}
