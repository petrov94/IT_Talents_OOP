public class StudentGroup {

    String groupSubject;
    Student [] students;
    byte freePLaces;


    StudentGroup(){
        students = new Student[5];
        freePLaces=5;
    }

    StudentGroup(String subject){
        this();
        groupSubject=subject;
    }

    void addStudent(Student student){
        if(student.subject.equals(this.groupSubject) && freePLaces>0){
            students[students.length-freePLaces]=student;
            freePLaces--;
        }
    }

    void emptyGroup(){
        students = new Student[5];
        freePLaces=5;
    }

    String theBestStudent(){
        String name = null;
        double maxGrade=0;
        for(Student student:this.students){
            if(student !=null && student.grade>maxGrade){
                name = student.name;
                maxGrade = student.grade;
            }
        }
        return name;
    }

    void printStudentsInGroup(){
        for(Student student : this.students){
            if(student!=null)
            System.out.println("This student has grade " + student.grade + " studying subject " + student.subject + " has money " + student.money + " is on " +student.age );
        }
    }
}
