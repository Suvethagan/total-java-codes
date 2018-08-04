package Array.java.csd11;

public class ArraySumValue {
	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sum = 0;
		for (int add = 0; add < array.length; add++) {

			sum += array[add];
			// System.out.println("Sum is "+sum);
		}
		System.out.println("Sum is " + sum);
	}
}
