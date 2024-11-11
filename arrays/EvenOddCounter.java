package arrays;

public class EvenOddCounter {
    public static void countEvenOdd(int[] arr) {
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};  
        countEvenOdd(numbers);
    }

    
}
