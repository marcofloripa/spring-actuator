package br.com.odaguiri.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloActuatorController {

	@RequestMapping(value = "/helloactuator", method = GET)
	public String helloActuator() {
		return "Hello from Spring Boot Actuator";
	}
}
