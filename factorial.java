import java.util.Scanner;

public class factorial {
    public static int fac(int number){
        if(number==1){
            return 1;
        }else{
            return number*fac(number-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fac(n));
    }
}
