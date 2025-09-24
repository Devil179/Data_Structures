public class prac12 {
    static int recur_fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return recur_fib(n - 1) + recur_fib(n - 2);
    }

    static int iter_fib(int n) {
        if (n < 2)
            return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    static void print_fib(int n) {
        if (n <= 0) {
            System.out.println();
            return;
        }
        if (n >= 1)
            System.out.print(0);
        if (n >= 2)
            System.out.print(" 1");
        int a = 0, b = 1;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    static void reversed(int n) {
        if (n < 0)
            return;
        System.out.print(n);
        if (n > 0) {
            System.out.print(" ");
            reversed(n - 1);
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(recur_fib(10));
        System.out.println(iter_fib(11));
        print_fib(10);
        reversed(10);
    }
}
