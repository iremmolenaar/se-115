import java.util.Scanner;

public class isItPrime {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } boolean assumed = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                assumed = false;
                break;
            }else{
                continue;
            }
        } return assumed;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println("Prime Number");
        }else {
                System.out.println("Not Prime Number");
            }
        }
    }

