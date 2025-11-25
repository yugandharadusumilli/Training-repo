package com.devops.training;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    
    @Test
    public void testGetGreeting() {
        App app = new App();
        String greeting = app.getGreeting();
        assertNotNull(greeting);
        assertEquals("Welcome to DevOps Training!", greeting);
    }
}
