package com.example.dubbo.server;

import com.example.dubbo.server.server.UserConsumerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author yushengma
 */
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
		UserConsumerServer userConsumerServer = run.getBean("userConsumerServer", UserConsumerServer.class);
		userConsumerServer.printUser();
	}
}
