package com.bits.devops;

/**
 * Hello world!
 *
 */
public class App 
{
    public String greet() {
        // CHANGE #1: message updated v1 -> v2 to trigger Continuous Integration
        return "Hello DevOps - Build v2 - Continuous Integration by 2023XXXXXXXX";
    }

    public int add(int a, int b) {
        return a + b;
    }

    // CHANGE #2: new method + corresponding new unit test
    public int multiply(int a, int b) {
        return a * b;
    }	
	
    public static void main( String[] args )
    {
        App app = new App();
	System.out.println(app.greet());
        System.out.println("2 + 3 = " + app.add(2, 3));
        System.out.println("4 * 5 = " + app.multiply(4, 5));
	System.out.println( "Hello World!" );
    }
}
