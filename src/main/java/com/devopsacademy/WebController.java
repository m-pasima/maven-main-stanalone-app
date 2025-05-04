package com.devopsacademy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    private static final Logger logger = LoggerFactory.getLogger(WebController.class);

    @GetMapping("/")
    public String home(@RequestParam(defaultValue = "DevOps Engineer") String name) {
        String message = sayHello(name);
        logger.info("Welcome message: " + message);
        return "<h1>Welcome to DevOps Academy Web App!</h1><p>" + message + "</p>";
    }

    public String sayHello(String name) {
        return "Hello, " + name + "! Keep rocking DevOps!";
    }
}

