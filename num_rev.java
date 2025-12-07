import java.util.Scanner;

public class num_rev {
    public static int reverse(int n) {
        int rev = 0;
        int a = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            a = reverse(n / 10) + rev;
            n=n/10;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(reverse(n));
        System.out.print(n);
    }
}




    //n=123 rem=3 rev=3 reverse(12) rem 2 rev=3*10+2= rev 32
    //

