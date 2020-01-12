package com.formacionbdi.springboot.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.formacionbdi.springboot.app.commons.models"})
public class SpringbootServicioProdcutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioProdcutosApplication.class, args);
	}

}
