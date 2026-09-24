package com.bits.devops;

public class App {

    public String greet() {
        return "Hello DevOps - Build v1";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.greet());
        System.out.println("2 + 3 = " + app.add(2, 3));
    }
}
