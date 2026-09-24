package com.bits.devops;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.Assert.assertTrue; // For the JUnit 4 test

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

 /* Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @org.junit.jupiter.api.Test
    void greetIsNotEmpty() {
        assertFalse(new App().greet().isEmpty());
    }

    @org.junit.jupiter.api.Test
    void addWorks() {
        assertEquals(5, new App().add(2, 3));
    }

    @org.junit.jupiter.api.Test
    void multiplyWorks() {
        assertEquals(20, new App().multiply(4, 5));
    }
}
