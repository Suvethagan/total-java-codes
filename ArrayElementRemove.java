package Array.java.csd11;

import java.util.Arrays;

public class ArrayElementRemove {
	public static void main(String[] args) {
		int ArrayDe[] = { 10, 20, 30, 40, 50, 60 };
		System.out.println(Arrays.toString(ArrayDe));
		Arrayutils.remove(ArrayDe,2);
	}
}