import java.util.Arrays;

public class Exam007_Array_softbasic {

	public static void main(String[] args) {
		int[] arr = {4, 23, 33, 15, 17, 19};
		Arrays.sort(arr);
		
		for (int i : arr)
			System.out.print(i+" ");
		
		System.out.println();
		
		String[] fruits= {"apple", "orange", "kiwi", "strawberry", "melon"};
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
		
	}
	
}