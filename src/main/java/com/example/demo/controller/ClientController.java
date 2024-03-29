package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/c")
public class ClientController {

	  @Autowired
	  DiscoveryClient discoveryClient;
	  
	  @GetMapping("/all")
	  public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
	  }
}
