import java.util.StringTokenizer;

public class BirthChapter {
	public static void main(String[] arguments) {
		StringTokenizer date;

		String date1 = "04/12/1983";
		date = new StringTokenizer(date1, "/");
		System.out.println("My birthday is: " + date1);
		System.out.println("Month: " + date.nextToken());
		System.out.println("Day: " + date.nextToken());
		System.out.println("Year: " + date.nextToken());
		System.out.println("I am currently 31 years old! I'm a java rockstar!!");
	}

}