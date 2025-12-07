public class Robot {
    private String modelName;
    private int batteryLevel;
    private String status;
    public Robot(String modelName, int batteryLevel, String status){
        this.modelName = modelName;
        this.batteryLevel = batteryLevel;
        this.status = status;
    }
    public String getModelName(){return modelName;}
    public int getBatteryLevel(){return batteryLevel;}
    public void displayRobotInfo(){
        System.out.println("Model: " + modelName);
        System.out.println("Battery Level: " + batteryLevel);
        System.out.println("Status: " + status);
    }
    public boolean isBatteryEnough(int requiredAmount){
        if(batteryLevel >= requiredAmount){
            return true;
        }else{
            return false;
        }
    }
    public void consumeBattery(int amount){
        if(isBatteryEnough(amount)){
            batteryLevel -= amount;
            System.out.println("Battery Level for "+modelName+": " + batteryLevel);
        }else{
            System.out.println("Not enough battery");
        }
    }
    public void chargeBattery(int amount){
        if(batteryLevel+amount < 100 ){batteryLevel += amount;
        status = "charging";}
        else    { batteryLevel = 100;
        status = "active";}

    }

    public void performTask(Task t){
        if (status=="charging"){
            System.out.println("FAIL:IT'S CHARGING");
        }
        if (isBatteryEnough(t.getEnergyCost())){
            System.out.println("completed the task");
        }else{
            System.out.println("not enough battery for"+ t.getTaskName());
        }


    }
    public void performTaskBatch(TaskBatch batch){
        if (batch.getTaskCount()==0){
            System.out.println("FAIL:batch contains no tasks");
        }else{
            if(isBatteryEnough(batch.getTotalEnergyCost())){
                System.out.println("robot is processing the batch");
                Task[] tasks = batch.getTasks();
                for(int i=0;i<tasks.length;i++){
                    performTask(tasks[i]);
                }
            }
        }
    }
}
