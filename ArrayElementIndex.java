package Array.java.csd11;

public class ArrayElementIndex {
	public static void main(String[] args) {
		char list[] = { 'S', 'U', 'V', 'E', 'T', 'H', 'A', 'G', 'A', 'N' };
		int index =1;
		for (int i = 0; (i < list.length) && (index == 1); i++) {
			if(list[i]=='E') {
				index = i;
			}
		}
			System.out.println(index);
	}
}
