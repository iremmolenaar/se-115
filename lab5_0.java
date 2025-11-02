import java.util.Scanner;

public class lab5_0 {
    public static int factorial(int n){
        if (n==0) {
            return 1;
        } else if (n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("What is your number?");
            int a = sc.nextInt();
            System.out.println(factorial(a));

        }
    }

