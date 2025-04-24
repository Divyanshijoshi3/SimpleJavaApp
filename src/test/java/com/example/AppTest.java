package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testMainMethodRuns() {
        try {
            App.main(null);  // Call main method
        } catch (Exception e) {
            fail("Main method should not throw exception");
        }
    }
}
