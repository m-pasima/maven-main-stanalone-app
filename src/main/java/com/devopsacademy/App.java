package com.devopsacademy;

import org.apache.log4j.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class);
    public static void main(String[] args) {
        logger.info("🚀 Welcome to DevOps Academy Standalone Application!");
        App app = new App();
        String message = app.sayHello("DevOps Engineer");
        logger.info("👉 " + message);
    }
    public String sayHello(String name) {
        return "Hello, " + name + "! Keep rocking DevOps!";
    }
}
