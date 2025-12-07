import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many products does the store have?");
        int n = sc.nextInt();
        Product [] arr = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Product’s name: ");
            String name = sc.next();
            System.out.println("Stock: ");
            int stock = sc.nextInt();
            arr[i] = new Product(name, stock);
        }
        System.out.println("Which product do you want to buy?");
        for (; ;) {
            int i = 0;
            String input = sc.nextLine();
            if (input.equals("Q")) {
                break;
            }else{
                for ( i = 0; i < arr.length; i++) {
                    if(input.equals(arr[i].getName())){
                            arr[i].buyOne();
                    }
                }
            }

        }
       for ( int i = 0; i < arr.length; i++) {
           arr[i].printInfo();
       }
    }
}

