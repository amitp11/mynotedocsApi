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

	@Bean
	CommandLineRunner preload(KeyValueRepository repository) {
		return args -> {
			repository.save(new KeyValueEntry("cwa-prod", "{\"username\":\"admin-prod\",\"password\":\"prod123\"}"));
			repository.save(new KeyValueEntry("cwa-dev", "{\"username\":\"admin-dev\",\"password\":\"dev123\"}"));
			repository.save(new KeyValueEntry("ucd-prod", "{\"username\":\"ucd-admin-prod\",\"password\":\"secureProd\"}"));
			repository.save(new KeyValueEntry("ucd-stage", "{\"username\":\"ucd-stage-user\",\"password\":\"stage321\"}"));
		};
	}
}
