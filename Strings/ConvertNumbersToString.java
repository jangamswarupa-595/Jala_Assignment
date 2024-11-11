package Strings;

public class ConvertNumbersToString {
    public static void main(String[] args) {
        int num = 123;
        double num2 = 45.67;
        String strNum = String.valueOf(num);
        String strNum2 = String.valueOf(num2);
        System.out.println("Converted Integer to String: " + strNum);
        System.out.println("Converted Double to String: " + strNum2);
    }
}
