class prac1 
{
    public static void main(String[] args) 
    {
        int arr[] = { 5, 10, 3, 25, 8 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array: " + max);
    }
}
