package hw2;

import absraction.AllWork;

public class DemoTaskAndEmployee {

	public static void main(String[] args) {


		AllWork tasks = new AllWork();

		for (int i = 0; i < 10; i++) {
			tasks.addTask(new Task("Task " + i, (int) (Math.random() * 10) + 1));
		}
		Employee[] employee = { new Employee("Pesho"), new Employee("Gosho"), new Employee("Ginka") };
		for (int i = 0; i < employee.length; i++) {
			employee[i].setCurrentTask(tasks.getNextTask());
			employee[i].setAllWork(tasks);
		}
		int day = 1;
		do {
			System.out.print("\n\nStart day " + day++);
			for (int i = 0; i < employee.length; i++) {
				employee[i].startWorkingDay();
				employee[i].work();
			}
		} while (!tasks.isAllWorkDone());

		for (int i = 0; i < employee.length; i++) {
			employee[i].showReport();
		}

	}

}
