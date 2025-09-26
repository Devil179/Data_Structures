public class prac14 {
    // Print 1 to N recursively
    static void one_to_n(int n) {
        if (n <= 0) return;        
        one_to_n(n - 1);           
        System.out.print(n + " "); 
    }   
    
    public static void main(String[] args) {
        int n = 10;
        one_to_n(n); 
        System.out.println();
    }
}
