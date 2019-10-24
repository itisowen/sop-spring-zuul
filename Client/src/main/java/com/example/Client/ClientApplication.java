package com.example.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Autowired
	ServiceDiscoveryClient serviceDiscoveryClient;
	@GetMapping("/{id}")
	Students getStudent(@PathVariable String id) {

		return serviceDiscoveryClient.getStudent(id);
	}

//	@Autowired
//	@GetMapping("/home")
//	public Students index(){
//		return ServiceDiscoveryClient.getStudent("60070105");
//	}

}
