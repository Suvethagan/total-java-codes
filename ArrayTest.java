package Array.java.csd11;

public class ArrayTest {
	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		char list[] = { 'S', 'U', 'V', 'E', 'T', 'H', 'A', 'G', 'A', 'N' };

		int index = 0;
		int sum = 0;
		double avarage = 0;

		for (int s = 0; s < array.length; s++) {
			sum += array[s];
		}
		System.out.println("sum is " + sum);


		for (double s = 0; s < array.length; s++) {
			avarage = sum / array.length;
		}
		System.out.println(avarage);

		
		for (int i = 1; (i < list.length) && (index == 0); i++) {
			if (list[i] == 'E') {
				index = i;
			}
		}
		System.out.println(index);
		int max = 0;
	}
}