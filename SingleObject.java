package Singleton;

public class SingleObject {
	private static SingleObject object = null;

	private SingleObject() {

	}

	public static SingleObject getInstance() {
		if (object == null) {
			object = new SingleObject();
		}
		return object;
	}
}
