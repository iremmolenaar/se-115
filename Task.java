public class Task {
    private String taskName;
    private int energyCost;
    public  Task(String taskName,int energyCost){
        this.taskName = taskName;
        this.energyCost = energyCost;
    }
    public void describeTask(){
        System.out.println("Task Name: " + taskName);
        System.out.println("Energy Cost: " + energyCost);
    }
    public int getEnergyCost(){return energyCost;}
    public String getTaskName(){return taskName;}
}
