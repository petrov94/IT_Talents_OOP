package inheritance;

public class Student extends Person {

    double score;

    protected Student(String name, int age, boolean isMale,double score) {
        super(name, age, isMale);
        this.score=score;
    }

    protected void showStudentInfo(){
        System.out.println(this.age+ " "+this.isMale+" "+this.name + " " +this.score);
    }
}
