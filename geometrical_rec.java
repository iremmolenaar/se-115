import java.util.Scanner;

public class geometrical_rec {
    public static double power(double r, int n) {
        double sum=0.0;
        if (n==0) {
            return 1.0;
        }else if(n==1) {
            return r;
        }else {
          return r*power(r,n-1);
        }
    }public static double geometrical(double r, int n) {
        double sum=0.0;

        if(n== 0) {
            return 1.0;
        }else if(n==1) {
            return r;
        }else{
                for(int i=0;i<=n;i++) {
                sum=sum+power(r,i);}
                return sum;
            }
        }
    public static void main(String[] args) {
        System.out.println("Enter a integer and a double");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double r=sc.nextDouble();
        System.out.println(geometrical(r,n));
    }
    }





