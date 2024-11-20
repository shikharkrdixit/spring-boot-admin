package com.shikhar.admin.shikhar_server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class ShikharServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShikharServerApplication.class, args);
	}

}
