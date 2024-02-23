package edu.dks.spring.boot.docker.img.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerImgApplication {

	@GetMapping("/")
	public String service(){
		return "Hello World ...........!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerImgApplication.class, args);
	}

}
