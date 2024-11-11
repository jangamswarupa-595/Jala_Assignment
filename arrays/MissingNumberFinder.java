package arrays;

public class MissingNumberFinder {
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[99];
        int missingNumber = 42;  // Example missing number
        for (int i = 0, j = 1; j <= 100; j++) {
            if (j != missingNumber) {
                numbers[i++] = j;
            }
        }
        
        int result = findMissingNumber(numbers, 100);
        System.out.println("The missing number is: " + result);
    }
    
}
