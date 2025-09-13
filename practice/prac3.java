public class prac3 
{
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) 
    {
        int[] arr = {5, 10, 3, 25, 8};
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
