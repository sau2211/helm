package com.vop.helm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelmApplication {

	@GetMapping("/")
	public String sayHello()
	{
		return "Welcome to first openshift deployment app";
	}
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input)
	{
		return "hi "+ input + "Your application deployed successfully";
 	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelmApplication.class, args);
	}

}
