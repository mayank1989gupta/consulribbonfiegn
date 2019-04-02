/**
 * 
 */
package com.test.consul.ribbon.fiegn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.test.consul.ribbon.fiegn.pojo.Fare;
import com.test.consul.ribbon.fiegn.pojo.TaxiRide;
import com.test.consul.ribbon.fiegn.service.TaxiFareCalculatorService;

import brave.sampler.Sampler;

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
		
		/*
		 * TaxiFareCalculatorService taxiFareCalculatorService =
		 * (TaxiFareCalculatorService) context.getBean(TaxiFareCalculatorService.class);
		 * TaxiRide taxiRide = new TaxiRide();
		 * taxiRide.setIsNightSurcharge(Boolean.TRUE); taxiRide.setDistanceInMile(190L);
		 * Fare rideFare = new Fare(); taxiFareCalculatorService.calculateFare(taxiRide,
		 * rideFare);
		 */
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
