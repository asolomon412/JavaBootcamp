package udemy;

public class GetExample {

	public static void main(String[] args) {
		GetPersonEx person1 = new GetPersonEx();

		person1.name = "Antonella";
		person1.age = 31;
		person1.salary = "$300,000,000";
		int years = person1.calulateYearsToRetirement();
		

		person1.speak();
		
		System.out.println("Years until retirement: " + years);
		System.out.println("You are currently " + person1.age + " years old.");
		int age = person1.getAge();
		
		System.out.println(age);
		System.out.println(person1.name);
		System.out.println("Your yearly salary is: " + person1.salary);

	}

}
