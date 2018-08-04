package Array.java.csd11;

public class ArrayAverage {
	public static void main(String[] args) {
		double numbers[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		double sum = 0;
		for (int add = 0; add < numbers.length; add++) {
			sum += numbers[add];
		}System.out.println(sum);
		double average = 0;
		if(numbers.length>0) {
			average = sum/numbers.length;
		}System.out.println(average);
	}
}

