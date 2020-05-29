package com.anri.weight.contr.app.weightcontrspbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class WeightContrSpbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeightContrSpbootAppApplication.class, args);
	}

}
