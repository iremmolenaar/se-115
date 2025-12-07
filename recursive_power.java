import java.util.Scanner;

public class recursive_power {
    public static int power(int base, int power) {
        if(power == 0) return 1;
        if(power == 1) return base;
        return power(base, power - 1) * base;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your base?");
        int base = sc.nextInt();
        System.out.println("What is your power?");
        int power = sc.nextInt();
        System.out.println("Your number is " + power(base, power));
    }
}
