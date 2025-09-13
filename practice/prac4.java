public class prac4 
{
    public static void main(String[] args) 
    {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            sum = sum + arr[i];
        }
        double sum_avg = sum; 
        double avg = sum_avg / arr.length;
        System.out.println("Average: " + avg);
    }
}
