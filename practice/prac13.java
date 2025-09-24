public class prac13 {
    static void fib(int n){
        if (n < 0) return;
        if (n == 0){
            System.out.print(0 + " ");
            return;
        }
        System.out.print(n + " ");
        fib(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        fib(10); 
        System.out.println();
    }
}
