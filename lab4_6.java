import java.util.Scanner;

public class lab4_6 {
    public static boolean isPrime(int n) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }else{
                continue;
            }
        }return isPrime;
    }
    public static void main(String[] args) {
        int steps = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();
        for( ; ; ) {
            System.out.println("Step"+ steps + ":" + start );
        if(isPrime(start)) {
            start = start * 2;
            steps++;
            System.out.println("Step" + steps + ":" + start);
        }else if (start % 3 == 0){
            start = start + 4;
            steps++;
            System.out.println("Step" + steps + ":" + start);

        }else if(start%2==0) {
            start = start / 2;
            steps++;
            System.out.println("Step"+ steps + ":" + start );
        }else {
                    start = start+1;
                    steps++;
                    System.out.println("Step"+ steps + ":" + start );
                    }
        if(start==end) {
                break;
        }if (steps == 1000) {
                System.out.println("Infinite loop detected!");
                break;
        }
        }
            }
        }
