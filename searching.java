import java.util.Scanner;

public class searching {
    public static boolean func(int [] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = {1,2,3,4,5,6};
        if(func(arr,n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
