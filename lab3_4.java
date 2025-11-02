import java.util.Scanner;

public class lab3_4 {
    public static void main(String[] args) {
        System.out.println("Write the side lengths between 1-500");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < 1 || a > 500 || b < 1 || b > 500 || c < 1 || c > 500) {
            System.out.println("INVALID LENGTH");
        }else if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("NOT A TRIANGLE");
            } else if (a == b || b == c || c == a) {
                System.out.println("EQUILATERAL");
            } else if ((a == b && a != c) || (b == c && b != a) || (c == a && a != b)) {
                System.out.println("ISOSCELES");
            }else if (a!=b && a!=c && b!=c ){
                System.out.println("SCALENE");
            } if (a+b>c && a+c>b && b+c>a){
            System.out.println("perimeter is "+ a+b+c);
        }

                }
            }




