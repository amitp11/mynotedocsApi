package com.mynotedocsApi.restapi;

import com.mynotedocsApi.restapi.entity.KeyValueEntry;
import com.mynotedocsApi.restapi.repository.KeyValueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootRestApiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiProjectApplication.class, args);
	}

}
