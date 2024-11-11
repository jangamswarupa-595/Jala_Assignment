package Strings;

public class StringSubstring {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substring = str.substring(7);   
        System.out.println("Substring: " + substring);
        String substring2 = str.substring(0, 5);  
        System.out.println("Substring from index 0 to 5: " + substring2);
    }
}