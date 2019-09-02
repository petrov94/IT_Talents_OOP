package inheritance;

public class Person {

    protected String name;
    protected int age;
    protected boolean isMale;

    protected Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    protected void showPersonInfo(){
        System.out.println(this.age+ " "+this.isMale+" "+this.name);
    }
}
