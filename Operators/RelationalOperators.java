package Operators;
public class RelationalOperators {
    public static void relationalOperators(int a, int b) {
        System.out.println("Less than: " + (a < b));
        System.out.println("Less than or equal: " + (a <= b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Greater than or equal: " + (a >= b));
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        relationalOperators(a, b);
    }
}

