public class fib_array {
    public static void main(String[] args) {
        int[] fib = new int[50];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i = 1; i < fib.length; i++) {
            System.out.println(fib[i]);
        }
    }
}
