package com.bits.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void greetIsNotEmpty() {
        assertFalse(new App().greet().isEmpty());
    }

    @Test
    void addWorks() {
        assertEquals(5, new App().add(2, 3));
    }
}
