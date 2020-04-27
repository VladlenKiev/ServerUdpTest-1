package com.xeon.udp.serverUdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerUdpApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ServerUdpApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(ServerUdpApplication.class);
		EchoServer echoServer = context.getBean("echoServer", EchoServer.class);
		echoServer.run();
	}



}
