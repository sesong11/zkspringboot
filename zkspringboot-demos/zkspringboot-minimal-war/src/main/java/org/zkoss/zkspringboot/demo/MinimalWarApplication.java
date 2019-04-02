package org.zkoss.zkspringboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
//@Controller
public class MinimalWarApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MinimalWarApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MinimalWarApplication.class);
	}

	@GetMapping("/")
	public String demo() {
		return "/minimal";
	}
}
