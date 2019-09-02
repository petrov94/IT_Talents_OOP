package random;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Student {

    String name;
    String subject;
    float grade;
    byte yearInCollege;
    byte age;
    boolean isDegree;
    double money;

    Student(){
        this.grade=4.0f;
        yearInCollege=1;
        isDegree=false;
        money=0;
    }

    Student(String name,byte age, String subject){
        this();
        this.name=name;
        this.subject=subject;
        this.age=age;
    }

    void upYear(){
        if(!this.isDegree){
            yearInCollege++;
            if(yearInCollege==4){
                isDegree=true;
            }
        }
        System.out.println("This student has already been graduated.");
    }

    double receiveScholarship(double min, double amount){
        if(this.grade>=min && this.age<=30){
            money+=amount;
        }
        return money;
    }
}
