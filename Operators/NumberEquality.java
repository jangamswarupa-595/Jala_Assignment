package Operators;

public class NumberEquality {
    public static void areNumbersEqual(int a, int b) {
        if (a == b) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }
    }

    public static void main(String[] args) {
        int a = 10, b = 10;
        areNumbersEqual(a, b);
    }
}
