/**
 * 
 */
package com.ust.eurekaserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrador
 *
 */

@RestController
@RequestMapping("/api/hello/server")
public class ServerControllerResource {
	
	@GetMapping
	public String hello() {
		return "Hello Ramon, Welcome to Eureka World Microservices";
	}

}
