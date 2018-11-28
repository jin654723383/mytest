package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
@SpringBootApplication
@Slf4j
public class MytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MytestApplication.class, args);
		log.info("run......");
		System.out.println("run......");
	}
	@RequestMapping("/")
	public String hello() {
	    return "Hello world";
	}
}
