package hw2;

import absraction.AllWork;

public class Employee {

    private String name;
    private Task currentTask;
    private int hoursLeft;
    private AllWork allWork;

    Employee(String name){
        setName(name);
    }

    public AllWork getAllWork() {
        return allWork;
    }

    public void setAllWork(AllWork allWork) {
        this.allWork = allWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null)
        this.name = name;
    }

    public int getHoursLeft() {
        return hoursLeft;
    }

    public void setHoursLeft(int hoursLeft) {
        if(hoursLeft>0 && hoursLeft<15)
        this.hoursLeft = hoursLeft;
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(Task currentTask) {
        if(currentTask!=null)
        this.currentTask = currentTask;
    }

    protected void work(){
        if(this.currentTask!=null && this.hoursLeft>0){
            if(this.hoursLeft>this.currentTask.getWorkingHours()){
                this.hoursLeft-=this.currentTask.getWorkingHours();
                this.currentTask.setWorkingHours(0);
                this.currentTask=null;
                work();
            }else {
                setHoursLeft(0);
                this.currentTask.setWorkingHours(this.currentTask.getWorkingHours()-this.hoursLeft);
            }
        }else if(this.currentTask==null && this.hoursLeft>0){
            this.currentTask = allWork.getNextTask();
            if(this.currentTask==null) {
                System.out.println("There is no more tasks, go on vacation!!!!!!!!!!!");
                showReport();
                return;
            }else {
                work();
            }
        }
    }

    protected void startWorkingDay(){
        this.hoursLeft=8;
    }

    protected void showReport(){
        if(this.currentTask!=null)
        System.out.println("Name " + this.name + " working on " +   this.currentTask.getName()  + " left working hours " + this.hoursLeft + " left hours of the task " + this.currentTask.getWorkingHours());
    }

}
