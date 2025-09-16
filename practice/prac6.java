public class prac6 {
    static int[] insertAtIndex(int[] arr, int index, int value) {
        int[] new_arr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            new_arr[i] = arr[i];
        }
        new_arr[index] = value;
        for (int i = index; i < arr.length; i++) {
            new_arr[i + 1] = arr[i];
        }
        return new_arr;
    }

    static int[] deleteAtIndex(int[] arr, int index) {
        int[] new_arr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            new_arr[i] = arr[i];
        }
        for (int i = index; i < new_arr.length; i++) {
            new_arr[i] = arr[i + 1];

        }
        return new_arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int index = 3;
        int value = 10;

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] inserted = insertAtIndex(arr, index, value);
        System.out.println("Array after insertion:");
        for (int i = 0; i < inserted.length; i++) {
            System.out.print(inserted[i] + " ");
        }
        System.out.println();

        int[] deleted = deleteAtIndex(arr, index);
        System.out.println("Array after deletion:");
        for (int i = 0; i < deleted.length; i++) {
            System.out.print(deleted[i] + " ");
        }
        System.out.println();
    }
}