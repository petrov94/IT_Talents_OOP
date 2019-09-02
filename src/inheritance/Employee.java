package inheritance;

public class Employee extends Person {

    protected double daySalary;


    protected Employee(String name, int age, boolean isMale,double daySalary) {
        super(name, age, isMale);
        this.daySalary=daySalary;
    }

    protected double calculateOvertime(double hours){
        if(this.age>18){
            if(hours>8){
                return (hours-8)*((daySalary/8)*1.5);
            }else {
                return 0;
            }
        }
        return 0;
    }

    protected void showEmployeeInfo(){
        System.out.println(this.age+ " "+this.isMale+" "+this.name + " "+ this.daySalary);
    }
}
