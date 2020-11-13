import java.util.Scanner;

public class Exam002_BMI_calculator {

	public static void main(String[] args) {
		String name;
		int age;
		double height;
		float weight;
		float bmi_index=0;
		float bmi_tmp=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이 이름을 입력하세요=");
		name = sc.next();
		System.out.println("당신이 나이를 입력하세요=");
		age = sc.nextInt();
		System.out.println("당신이 키를 입력하세요=");
		height = sc.nextDouble();
	
		System.out.println("당신이 몸부게를 입력하세요=");
		weight = sc.nextFloat();
		
 		// bmi_idex = 몸무게/키를 meter 단위변경 제곱
		
		bmi_tmp = (float) height/100;
		bmi_index = weight/(bmi_tmp*bmi_tmp);
		
//		bmi_index = weight/(float) Math.pow(((float) height/100),2);
		
		System.out.printf("%s님의 나이는 %d세 키는 %.1f cm 이고 몸무게는 %.1f kg 입니다. \n", name, age, height, weight);
		System.out.printf("계산해 보니 당신의 BMI 지수는 = %.1f 입니다.\n",bmi_index);
		
	}

}