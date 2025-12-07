import java.util.Scanner;

public class geometrical_inter {
    public static void main(String[] args){
        System.out.println("Enter a r number(double): ");
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        System.out.println("Enter a n number(int): ");
        int n=sc.nextInt();
        double n1=1.0;
        double n2=r;
        double sum=n1+n2;
        for(int i=0;i<n;i++){
            n1=n2;
            n2=n2*r;
            sum=sum+n2;
        }System.out.println(sum);
    }
}
