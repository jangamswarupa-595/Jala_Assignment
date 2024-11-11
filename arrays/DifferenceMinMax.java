package arrays;

public class DifferenceMinMax {
    public static int differenceMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        
        return max - min;
    }

    public static void main(String[] args) {
        int[] numbers = {7, 2, 5, 10, 3};  // Example array
        int difference = differenceMinMax(numbers);
        System.out.println("Difference between largest and smallest: " + difference);
    }
}
