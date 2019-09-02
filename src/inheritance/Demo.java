package inheritance;

public class Demo {

    public static void main (String [] args){
        Person[] person = new Person[10];

        Person pesho = new Person("Pesho", 19, true);
        Person gosho = new Person("Gosho", 17, true);

        Employee tosho = new Employee("Tosho", 19, true, 40);
        Employee ginka = new Employee("Ginka", 17, false, 39);

        Student puhi = new Student("Puhi", 18, false, 5);
        Student iva = new Student("Iva", 19, false, 6);

        person[0] = pesho;
        person[1] = gosho;
        person[2] = tosho;
        person[3] = ginka;
        person[4] = puhi;
        person[5] = iva;

        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Employee) {
                ((Employee) person[i]).showEmployeeInfo();
            } else if (person[i] instanceof Student) {
                ((Student) person[i]).showStudentInfo();
            } else if (person[i] instanceof Person) {
                person[i].showPersonInfo();
            }
        }
        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Employee) {
                System.out.printf("\n%s overtime: %.2f", person[i].name,
                        ((Employee) person[i]).calculateOvertime(10));
            }
        }
    }
}
