package oop.abstrct;

public abstract class Tree {
	protected String leafColor;

	public abstract void grow();

	public String getLeafColor() {
		return leafColor;
	}

	public void setLeafColor(String leafColor) {
		this.leafColor = leafColor;
	}

	public void treeFeature() {
		System.out.println("Trees Have branches");
	}
}
