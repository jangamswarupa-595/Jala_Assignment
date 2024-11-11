package arrays;

public class RemoveDuplicates1 {
    public static int[] removeDuplicates(int[] arr) {
        int[] tempArray = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == tempArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempArray[count++] = arr[i];
            }
        }

        int[] resultArray = new int[count];
        for (int i = 0; i < count; i++) {
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 5};  // Example array
        int[] uniqueNumbers = removeDuplicates(numbers);
        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}
