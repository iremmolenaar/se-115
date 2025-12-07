import java.util.Scanner;

public class numReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversed = 0;
       for(int i=n;i>0;i=i/10){
            int last_digit = i%10;
           reversed = (reversed * 10) + last_digit;
        }
        System.out.println(reversed);
    }
}
