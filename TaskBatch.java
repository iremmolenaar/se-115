public class TaskBatch {
   private Task[] tasks;
    private int taskCount;
    public TaskBatch(){
        this.tasks = new Task[5];
        taskCount = 0;
    }

    public void addTask(Task t){
        if(taskCount<tasks.length){
            tasks[taskCount] = t;
            taskCount++;

        }else{
            System.out.println("ERROR:MAX 5 TASKS REACHED");
        }
    }
    public int getTotalEnergyCost(){
        int sum = 0;
        for(int i=0;i<taskCount;i++) {
            sum += tasks[i].getEnergyCost();
        }
        if(sum==0){
            System.out.println("ERROR:the batch contains no tasks");
        }else{
            System.out.println("The total energy cost is "+sum);
        }
        return sum;
    }
    public Task[] getTasks(){
        for(int i=0;i< tasks.length;i++) {
            if(tasks[i]!=null){
                System.out.println(tasks[i].getTaskName());

            }else{
                System.out.println("ERROR:the batch contains no tasks");}
        }return tasks;
    }
    public void printBatchInfo(){
        for(int i=0;i< tasks.length;i++) {
            if(tasks[i]!=null){
                System.out.println("name: "+tasks[i].getTaskName()+" cost: "+tasks[i].getEnergyCost());
            }else{
                System.out.println("ERROR:the batch contains no tasks");
            }
        }
    }

    public int getTaskCount() {
        return taskCount;
    }
}


