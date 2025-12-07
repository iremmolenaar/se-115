import java.util.Scanner;

public class Sum_of_Digits_in_Integer {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int sum = 0;
       for(;n>0;n=n/10){
        int last_digit = n%10;
        sum = sum+last_digit;
       }System.out.println(sum);
    }
}

