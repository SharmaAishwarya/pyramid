package com.api.pyramid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.api"})
public class PyramidApplication {

	public static void main(String[] args) {
		SpringApplication.run(PyramidApplication.class, args);
	}

}
