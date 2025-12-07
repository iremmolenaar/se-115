import java.util.Scanner;

public class finding_index {
    public static int func(int[] arr,int num){
        for(int j=0;j<arr.length;j++){
            if(arr[j]==num){
                return j;
            }
        }return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,};
        System.out.println(func(arr,n));
    }
}
