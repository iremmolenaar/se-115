import java.util.Scanner;

public class lab5_2 {
    public static int power(long base, int exp){
        if(exp==0){
            return 1;
        } else if (exp ==1) {
            return (int)base;
        } else return (int) base * power(base,exp-1);
    }public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a =sc.nextLong();
        int b =sc.nextInt();
        System.out.println(power(a,b));

    }
}
