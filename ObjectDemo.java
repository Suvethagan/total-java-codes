package Singleton;

public class ObjectDemo {
	public static void main(String[] args) {
		SingleObject object1 = SingleObject.getInstance();
		System.out.println(object1);
		SingleObject object2 = SingleObject.getInstance();
		System.out.println(object2);

	}
}
