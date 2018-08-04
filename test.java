package oop.abstrct;

public class test {
	public static void main(String[] args) {
		int result = 5 / 2;
		System.out.println(result);
		try {
			int result1 = 5 / 0;
			System.out.println(result1);
		} catch (Exception e) {
			System.err.println("Error" + e.getMessage());
		}
		int result2 = 5 / 3;
		System.out.println(result2);
	}
}
