package study;

public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(a); // 1.1
		System.out.println(b); // 1.0
		System.out.println(b2); // 1.0
		
//		int c = 1.1; // Error
		double d = 1.1; // 1.1
		int e = (int) 1.1;
		
		System.out.println(e); // 1
		
		// 1 to String
		String f = Integer.toString(1); // 1을 문자열로 바꿈
		System.out.println(f.getClass()); // 데이터타입 확인
	}
}
