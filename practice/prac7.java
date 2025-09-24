public class prac7 {
    static int linearSearch(int[] arr, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 12, 23, 34, 43 };
        int value = 34;
        int size = arr.length;
        int idx1 = linearSearch(arr, size, value);
        int idx = binarySearch(arr, value);
        System.out.println("(binarySearch)value: " + value + "\n" + "found at index: " + idx);
        System.out.println("(LinearSearch)value: " + value + "\n" + "found at index: " + idx1);
    }
}