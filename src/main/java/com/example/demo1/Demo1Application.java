package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.boot.context.event.ApplicationReadyEvent;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void applicationReady() {
        String url = "http://localhost:8080";
        System.out.println("Application started! Access the application at: " + url);
    }
}
