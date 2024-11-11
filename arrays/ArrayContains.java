package arrays;

public class ArrayContains {
    public static boolean contains(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("Contains 20: " + contains(arr, 20));
    }
    
}
