import java.util.Scanner;

public class FactoryDemo {
    public static void main(String[] args) {
        Robot r1= new Robot("name1",50,"active");
        Robot r2= new Robot("name2",30,"active");
        Scanner sc = new Scanner(System.in);
        System.out.print("amount of battery to consume for "+r1.getModelName()+":");
        int amount = sc.nextInt();
        r1.consumeBattery(amount);
        Task t1 = new Task(" t1",40);
        r2.performTask(t1);
        Task t2 = new Task(" t2",50);
        Task t3 = new Task(" t3",30);
        TaskBatch b1 = new TaskBatch();
        b1.addTask(t1);
        b1.addTask(t2);
        b1.addTask(t3);
        b1.printBatchInfo();
        r1.performTaskBatch(b1);
    }
}
