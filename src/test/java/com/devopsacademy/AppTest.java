package com.devopsacademy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testSayHello() {
        WebController controller = new WebController();
        String result = controller.sayHello("DevOps Engineer");
        assertEquals("Hello, DevOps Engineer! Keep rocking DevOps!", result);
    }
}

