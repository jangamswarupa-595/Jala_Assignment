package Strings;

public class StringCreation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("World");
        StringBuilder builder = new StringBuilder("Java");
        String str3 = builder.toString();

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
    }
    
}
