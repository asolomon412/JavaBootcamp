import java.util.*;

public class ComicBooks {
	private static final String NEAR_MINT = "near mint";
	private static final String POOR = "poor";
	private static final String GOOD = "good";
	private static final String FINE = "fine";
	private static final String MINT = "mint";
	private static final String VERY_FINE = "very fine";

	// this constructor is really not needed
	public ComicBooks() {

	}

	public static void main(String[] args) {
		// set up hash map
		HashMap<String, Float> quality = createCollection();

		// set up collection
		Comic[] comix = new Comic[3];
		float inBasePrice = 5_000.00F;
		comix[0] = new Comic("Amazing Spider-Man", "1A", VERY_FINE, inBasePrice);
		comix[0].setPrice((Float) quality.get(comix[0].condition));
		comix[1] = new Comic("Incredible Hulk", "181", NEAR_MINT, 240.00F);
		comix[1].setPrice((Float) quality.get(comix[1].condition));
		comix[2] = new Comic("Cerebus", "1A", GOOD, 144.00F);
		comix[2].setPrice((Float) quality.get(comix[2].condition));
		displayValues(comix);

	}

	private static void displayValues(Comic[] comix) {
		for (int i = 0; i < comix.length; i++) {
			System.out.println("Title: " + comix[i].title);
			System.out.println("Issue: " + comix[i].issueNumber);
			System.out.println("Condition: " + comix[i].condition);
			System.out.println("Price: $" + comix[i].price + "\n");

		}
	}

	private static HashMap<String, Float> createCollection() {
		HashMap<String, Float> quality = new HashMap<String, Float>();
		float price1 = 3.00F;
		quality.put(MINT, price1);
		float price2 = 2.00F;
		Float put = quality.put(NEAR_MINT, price2);
		float price3 = 1.50F;
		quality.put(VERY_FINE, price3);
		float price4 = 1.50F;
		quality.put(FINE, price4);
		float price5 = 0.50F;
		quality.put(GOOD, price5);
		float price6 = 0.25F;
		quality.put(POOR, price6);
		return quality;
	}

}

class Comic {
	String title;
	String issueNumber;
	String condition;
	float basePrice;
	float price;

	Comic(String inTitle, String inIssueNumber, String inCondition,
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
