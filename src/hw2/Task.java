package hw2;

public class Task {

    private String name;
    private int workingHours;


    Task(String name, int workingHours){
        if(name!=null && !name.equals("")){
            setName(name);
        }
        if(workingHours>0){
            setWorkingHours(workingHours);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
