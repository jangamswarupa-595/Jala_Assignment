package Operators;

public class LogicalOperators {
    public static void logicalOperations(boolean a, boolean b) {
        System.out.println("Logical AND: " + (a && b));
        System.out.println("Logical OR: " + (a || b));
        System.out.println("Logical NOT (a): " + !a);
    }

    public static void main(String[] args) {
        boolean a = true, b = false;
        logicalOperations(a, b);
    }
}

