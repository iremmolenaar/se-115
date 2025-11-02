import java.util.Scanner;

public class lab4_3 {
    public static int factorial(int n) {
        int multiplication = 1;
        for (int i = 1; i <= n; i++) {
            multiplication = i * multiplication;
        }return multiplication;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = factorial(n);
    System.out.println(m);
}
}