import java.math.BigInteger;

public class Exam003_BigInteger {

	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(100_000_000); // 1��
		BigInteger b = BigInteger.valueOf(200_000_000); // 2��
		BigInteger c;

		c = a.multiply(b);
		System.out.println(c);		



	}

}