package hw2;
public class DemoTaskAndEmployee {

	public static void main(String[] args) {

		Employee pesho = new Employee("pesho");
		Employee gosho = new Employee("gosho");

		Task makeCar = new Task("make Car", 7);
		Task makeShip = new Task("make Ship", 12);

		pesho.setCurrentTask(makeCar);
		gosho.setCurrentTask(makeShip);

		pesho.setHoursLeft(8);
		gosho.setHoursLeft(5);

		pesho.work();
		gosho.work();

		pesho.showReport();
		gosho.showReport();

	}

}
