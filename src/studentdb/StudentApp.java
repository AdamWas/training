package studentdb;

import java.util.Random;

public class StudentApp {

	public static void main(String[] args) {
		Student st1 = new Student("John", "Smith", "0987654321");
		st1.pay(10.0);
		st1.enroll("Biology");
		st1.enroll("English");
		st1.showCourses();
	}
}

