public class prac3 
{
    public static void main(String[] args) 
    {
        int[] arr = {5,10,3,25,8};
        int i = 0;
            int j = arr.length - 1;
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
        }
        int k = 0;
        while (k < arr.length) {
            System.out.println(arr[k]);
            k++;    
        }
    }
}
