package Operators;

public class Arithmetic {
    public static void arithmeticOperations(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        int a = 10, b = 5;
        arithmeticOperations(a, b);
    }
}

    
    