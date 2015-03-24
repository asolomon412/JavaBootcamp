import java.util.HashMap;

public class NewComicBooks {
	// this constructor is really not needed
	public NewComicBooks() {

	}

	public static void main(String[] args) {
		// set up hash map
		HashMap<String, Float> quality = new HashMap<String, Float>();
		float price1 = 3.00F;
		quality.put("mint", price1);
		float price2 = 2.00F;
		quality.put("near mint", price2);
		float price3 = 1.50F;
		quality.put("very fine", price3);
		float price4 = 1.50F;
		quality.put("fine", price4);
		float price5 = 0.50F;
		quality.put("good", price5);
		float price6 = 0.25F;
		quality.put("pristine mint", price6);
		float price7 = 5.00F;
		quality.put("coverless", price7);
		float price8 = 0.10F;
		quality.put("poor", price8);

		// set up collection
		Comic[] comix = new Comic[3];
		comix[0] = new Comic("Amazing Spider-Man", "1A", "very fine", 5_000.00F);
		comix[0].setPrice((Float) quality.get(comix[0].condition));
		comix[1] = new Comic("Incredible Hulk", "181", "near mint", 240.00F);
		comix[1].setPrice((Float) quality.get(comix[1].condition));
		comix[2] = new Comic("Cerebus", "1A", "good", 144.00F);
		comix[2].setPrice((Float) quality.get(comix[2].condition));
		for (int i = 0; i < comix.length; i++) {
			System.out.println("Title: " + comix[i].title);
			System.out.println("Issue: " + comix[i].issueNumber);
			System.out.println("Condition: " + comix[i].condition);
			System.out.println("Price: $" + comix[i].price + "\n");

		}

	}

}

class NewComic {
	String title;
	String issueNumber;
	String condition;
	float basePrice;
	float price;

	NewComic(String inTitle, String inIssueNumber, String inCondition,
			float inBasePrice) {

		title = inTitle;
		issueNumber = inIssueNumber;
		condition = inCondition;
		basePrice = inBasePrice;

	}

	void setPrice(float factor) {
		price = basePrice * factor;
	}
}