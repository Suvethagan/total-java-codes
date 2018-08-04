package Java.oop.in_face;

public class Mango implements Fruit {

	@Override
	public void fruitName() {
		System.out.println("It is a Mango");
	}

	@Override
	public String fruitColour() {
		return "Yellow";
	}

	public String placetoGrow() {
		return "typical temperature";

	}

	@Override
	public String price() {
		return "in between 20 - 50 LKR";
	}

}
