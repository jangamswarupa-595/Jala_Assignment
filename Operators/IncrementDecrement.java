package Operators;

public class IncrementDecrement {
    public static int increment(int x) {
        x = x + 1;
        return x;
    }

    public static int decrement(int x) {
        x = x - 1;
        return x;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Incremented value: " + increment(x));  
        System.out.println("Decremented value: " + decrement(x));  
    }
}

