/**
 * 
 */
package com.test.consul.ribbon.fiegn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

/**
 * @author MGupta
 *
 */
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@EnableDiscoveryClient
@EnableFeignClients
public class PatientBootApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(PatientBootApplication.class, args);
	}

	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
