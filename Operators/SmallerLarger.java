package Operators;
public class SmallerLarger {
    public static void printSmallerAndLarger(int a, int b) {
        int smaller, larger;
        
        if (a < b) {
            smaller = a;
            larger = b;
        } else {
            smaller = b;
            larger = a;
        }

        System.out.println("Smaller number: " + smaller);
        System.out.println("Larger number: " + larger);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        printSmallerAndLarger(a, b);
    }
}

