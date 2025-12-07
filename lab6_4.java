import java.util.Random;

public class lab6_4 {
    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        int[] arr = new int[30];
        int sum = 0;
        for(int i=0;i<30;i++) {
            arr[i] = r.nextInt(100);

        }
        for(int i=0;i<30;i++) {
            if(i==0 && i==29){          //the first and last elements are not considered peaks.
                continue;
            }


            if(arr[i]>arr[i+1] && arr[i]<arr[i-1]) {
                System.out.println(arr[i]+" is peak");
                sum = sum + 1;
            }
        } System.out.println(sum +" peaks exist");
    }
}
