package Java.oop.in_face;

public class Apple implements Fruit {

	@Override
	public void fruitName() {
		System.out.println("It is an Apple");
	}

	@Override
	public String fruitColour() {
		return "Red";
	}

	public String placetoGrow() {
		return "cool climate place";

	}

	@Override
	public String price() {
		return "in between 50 - 100 LKR";
	}
}
