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
        logger.info("Generated message: " + message);

        return "<div style='text-align:center; font-family:Arial, sans-serif; padding:50px; background-color:#f4f4f4;'>" +
               "<h1 style='color:#2c3e50; font-size:36px;'>Welcome to the <span style='color:#2980b9;'>DevOps Academy Standalone Application</span></h1>" +
               "<h2 style='color:#27ae60; font-size:28px; margin-top:20px;'>Hello, " + name + "! Keep rocking DevOps!</h2>" +
               "<p style='font-size:18px; color:#555; margin-top:30px;'>This is a standalone Java application with web access, running on Amazon EC2.</p>" +
               "</div>";
    }

    public String sayHello(String name) {
        return "Hello, " + name + "! Keep rocking DevOps!";
    }
}

