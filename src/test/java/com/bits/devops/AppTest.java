package com.bits.devops;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
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

     @Test
    void greetIsNotEmpty() {
        assertFalse(new App().greet().isEmpty());
    }

    @Test
    void addWorks() {
        assertEquals(5, new App().add(2, 3));
    }

    @Test
    void multiplyWorks() {
        assertEquals(20, new App().multiply(4, 5));
    }
}
