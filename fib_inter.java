public class fib_inter {
    public static int fib(int n) { // assuming n >= 0
        int f = 0;
        int n1 = 0;
        int n2 = 1;
        if (n == 0) f = n1;
        if (n == 1) f = n2;
        for (int i = 2; i <= n; i++) {
            f = n1 + n2;
            n1 = n2;
            n2 = f;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("fib(10) is " + fib(10));
    }
}
