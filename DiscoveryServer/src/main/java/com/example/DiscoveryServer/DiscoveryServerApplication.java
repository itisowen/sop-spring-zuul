package com.example.DiscoveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class DiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerApplication.class, args);
	}

//	@RequestMapping(value = "/", method = RequestMethod.POST)
//	public String hello2(@RequestBody Object object) {
//		return String.format("{\"payload\":\"%s\"}", object);
//	}

}
