package arrays;

public class ArrayRemove {
    public static int[] removeElement(int[] arr, int value) {
        int count = 0;
        for (int num : arr) {
            if (num != value) count++;
        }
        
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num != value) {
                result[index++] = num;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = removeElement(arr, 3);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
}
