package com.nttdata.bootcamp.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Configserver1Application {

	public static void main(String[] args) {
		SpringApplication.run(Configserver1Application.class, args);
	}

}
