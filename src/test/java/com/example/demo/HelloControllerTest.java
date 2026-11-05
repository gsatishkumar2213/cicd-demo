// src/test/java/com/example/demo/HelloControllerTest.java
package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {
    @Test
    void returnsGreeting() {
        assertEquals("Wrong", new HelloController().hello());
    }
}