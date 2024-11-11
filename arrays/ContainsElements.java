package arrays;

public class ContainsElements {
    public static boolean containsBoth(int[] arr, int val1, int val2) {
        boolean foundVal1 = false, foundVal2 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val1) foundVal1 = true;
            if (arr[i] == val2) foundVal2 = true;
        }
        return foundVal1 && foundVal2;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 23, 7};  
        boolean result = containsBoth(numbers, 12, 23);
        System.out.println("Array contains both 12 and 23: " + result);
    }
}
