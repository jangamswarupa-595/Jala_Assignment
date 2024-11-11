package arrays;

public class MinMaxArray {
    public static int[] findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};
        int[] minMax = findMinMax(arr);
        System.out.println("Min: " + minMax[0] + ", Max: " + minMax[1]);
    }
    
}
