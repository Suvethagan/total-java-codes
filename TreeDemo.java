package oop.abstrct;

public class TreeDemo {
	public static void main(String[] args) {
		Tree Mango = new Mango();
		Tree Apple = new Apple();
		Mango.setLeafColor("Green Leaf");
		Mango.grow();
		Mango.treeFeature();
		System.out.println(" ");
		Apple.setLeafColor("Light Green Leaf");
		Apple.grow();
		Apple.treeFeature();
	}
}
