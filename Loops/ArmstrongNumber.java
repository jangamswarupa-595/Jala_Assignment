package Loops;


public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153, originalNumber = number, result = 0;
        
        while (number != 0) {
            int remainder = number % 10;
            result += remainder * remainder * remainder;
            number /= 10;
        }
        
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
    
}
