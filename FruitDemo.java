package Java.oop.in_face;

public class FruitDemo {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Mango mango = new Mango();

		apple.fruitName();
		System.out.println("Color is " + apple.fruitColour());
		System.out.println("It can grow in " + apple.placetoGrow());
		System.out.println("Price is "+ apple.price());
		System.out.println(" ");
		mango.fruitName();
		System.out.println(mango.fruitColour());
		System.out.println("It can grow in " + apple.placetoGrow());
		System.out.println("Price is "+ mango.price());
	}
}
