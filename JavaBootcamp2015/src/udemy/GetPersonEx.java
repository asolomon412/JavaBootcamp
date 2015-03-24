package udemy;

public class GetPersonEx {

	String name;
	int age;
	String salary;

	void speak() {
		System.out.println("My name is " + name);
	}

	int calulateYearsToRetirement() {
		int yearsLeft = 65 - age;

		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getSalary() {
		return salary;
	}
	
}
