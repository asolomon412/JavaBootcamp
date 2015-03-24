import java.util.ArrayList;

public class FruitBasket {

	public static void main(String[] args) {

		ArrayList<Fruit> basket = new ArrayList<Fruit>();

		Fruit apple = new Fruit("apple", 3, 2.50F);
		basket.add(apple);
		Fruit orange = new Fruit("orange", 10, 2.00F);
		basket.add(orange);
		Fruit pear = new Fruit("pear", 17, 4.50F);
		basket.add(pear);

		for (Fruit stuff : basket) {
			System.out.println(stuff.name + stuff.price + stuff.quantity);

		}
	}

}

class Fruit {
	String name;
	int quantity;
	float price;

	public Fruit(String name, int quantity, float price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;

	}

}
