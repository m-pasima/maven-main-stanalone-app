package com.devopsacademy;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testSayHello() {
        App app = new App();
        String result = app.sayHello("DevOps Engineer");
        assertEquals("Hello, DevOps Engineer! Keep rocking DevOps!", result);
    }
}
