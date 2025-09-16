public class prac5 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        if (n % 2 == 0) {
            int mid1 = arr[(n / 2) - 1];
            int mid2 = arr[n / 2];
            System.out.println("Middle elements: " + mid1 + " " + mid2);
        } 
        else {
            int mid = arr[n / 2];
            System.out.println("Middle element: " + mid);
        }
    }
}
