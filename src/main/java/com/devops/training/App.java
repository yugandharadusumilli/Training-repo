package com.devops.training;

/**
 * Sample application for DevOps and Git training
 */
public class App {
    
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
    
    public void run() {
        System.out.println("=================================");
        System.out.println("DevOps Training Application v1.0");
        System.out.println("=================================");
        
        Calculator calculator = new Calculator();
        
        int sum = calculator.add(10, 5);
        int difference = calculator.subtract(10, 5);
        int product = calculator.multiply(10, 5);
        int quotient = calculator.divide(10, 5);
        
        System.out.println("\nCalculator Demo:");
        System.out.println("10 + 5 = " + sum);
        System.out.println("10 - 5 = " + difference);
        System.out.println("10 * 5 = " + product);
        System.out.println("10 / 5 = " + quotient);
        
        System.out.println("\nApplication executed successfully!");
    }
    
    public String getGreeting() {
        return "Welcome to DevOps Training!";
    }
}
