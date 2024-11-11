package Strings;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello World";
        System.out.println("Equals: " + str1.equals(str2));  
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));  
        System.out.println("Starts with 'Hel': " + str1.startsWith("Hel"));
        System.out.println("Ends with 'lo': " + str1.endsWith("lo"));
        System.out.println("CompareTo: " + str1.compareTo(str3));  
    }
}
