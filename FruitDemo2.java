package Bcasjava;

import Java.oop.in_face.Fruit;

public class FruitDemo2 {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Mango mango = new Mango();

		apple.fruitName();
		System.out.println("Color is " + apple.fruitColour());
		System.out.println("It can grow in " + apple.placetoGrow());
		System.out.println("Price is " + apple.price());
		System.out.println(" ");
		mango.fruitName();
		System.out.println(mango.fruitColour());
		System.out.println("It can grow in " + apple.placetoGrow());
		System.out.println("Price is " + mango.price());
	}
}

class Apple implements Fruit {

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
class Mango implements Fruit {

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