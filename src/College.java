public class College {

    public static void main(String [] args){

        Student pesho = new Student("Pesho", (byte)19, "IT");
        Student tosho = new Student("Tosho", (byte)20, "IT");
        Student gosho = new Student("Gosho", (byte)22, "MAT");
        Student penka = new Student("Penka", (byte)31, "MAT");
        Student geri = new Student("Geri", (byte) 41, "IT");

        pesho.receiveScholarship(3, 100);
        tosho.receiveScholarship(3, 100);
        gosho.receiveScholarship(3, 100);
        geri.receiveScholarship(3, 100);
        penka.receiveScholarship(3, 100);

        pesho.upYear();
        gosho.upYear();
        tosho.upYear();
        tosho.grade=5;
        gosho.grade=5;

        StudentGroup it = new StudentGroup("IT");
        StudentGroup mat = new StudentGroup("MAT");

        it.addStudent(pesho);
        it.addStudent(tosho);
        it.addStudent(gosho);
        it.addStudent(penka);
        it.addStudent(geri);

        mat.addStudent(pesho);
        mat.addStudent(tosho);
        mat.addStudent(gosho);
        mat.addStudent(penka);
        mat.addStudent(geri);

        it.printStudentsInGroup();
        it.theBestStudent();

        mat.printStudentsInGroup();
        mat.theBestStudent();

    }
}
