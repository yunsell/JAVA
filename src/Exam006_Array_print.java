import java.util.Arrays;

public class Exam006_Array_print {

	public static void main(String[] args) {
		int[] arr = {4, 23, 33, 15, 17, 19};
// ����ϴ� ����° ���
		for (int i : arr)
			System.out.println(i+" ");
		
// ����ϴ� �ι�° ���		
//		System.out.println(Arrays.toString(arr));
		
// ����ϴ� ù��° ���		
//		for (int i=0; i<arr.length; i++)
//			System.out.print(arr[i]+" ");
	}
}
