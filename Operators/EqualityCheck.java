package Operators;

public class EqualityCheck {
    public static void checkEquality(int a, int b) {
        if (a == b) {
            System.out.println("Equal: true");
            System.out.println("Not Equal: false");
        } else {
            System.out.println("Equal: false");
            System.out.println("Not Equal: true");
        }
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        checkEquality(a, b);
    }
}
