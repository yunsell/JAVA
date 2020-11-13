import java.util.Arrays;

public class Exam006_Array_print {

	public static void main(String[] args) {
		int[] arr = {4, 23, 33, 15, 17, 19};
// 출력하는 세번째 방법
		for (int i : arr)
			System.out.println(i+" ");
		
// 출력하는 두번째 방법		
//		System.out.println(Arrays.toString(arr));
		
// 출력하는 첫번째 방법		
//		for (int i=0; i<arr.length; i++)
//			System.out.print(arr[i]+" ");
	}
}
