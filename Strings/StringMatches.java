package Strings;

public class StringMatches {
    public static void main(String[] args) {
        String str = "Hello123";
        boolean matches = str.matches("[A-Za-z0-9]+");
        System.out.println("String matches pattern: " + matches);
    }
    
}
