package arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueArr = new int[arr.length];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArr[index++] = arr[i];
            }
        }

        int[] result = new int[index];
        System.arraycopy(uniqueArr, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] uniqueArr = removeDuplicates(arr);
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
    
}
