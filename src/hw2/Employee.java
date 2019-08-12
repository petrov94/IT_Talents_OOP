package hw2;

public class Employee {

    private String name;
    private Task currentTask;
    private int hoursLeft;

    Employee(String name){
        setName(name);
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
            }else {
                setHoursLeft(0);
                this.currentTask.setWorkingHours(this.currentTask.getWorkingHours()-this.hoursLeft);
            }
        }
        showReport();
    }

    protected void showReport(){
        System.out.println("Name " + this.name + " working on " + this.currentTask.getName() + " left working hours " + this.hoursLeft + " left hours of the task " + this.currentTask.getWorkingHours());
    }

}
