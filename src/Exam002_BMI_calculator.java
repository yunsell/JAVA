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
		System.out.println("����� �̸��� �Է��ϼ���=");
		name = sc.next();
		System.out.println("����� ���̸� �Է��ϼ���=");
		age = sc.nextInt();
		System.out.println("����� Ű�� �Է��ϼ���=");
		height = sc.nextDouble();
	
		System.out.println("����� ���ΰԸ� �Է��ϼ���=");
		weight = sc.nextFloat();
		
 		// bmi_idex = ������/Ű�� meter �������� ����
		
		bmi_tmp = (float) height/100;
		bmi_index = weight/(bmi_tmp*bmi_tmp);
		
//		bmi_index = weight/(float) Math.pow(((float) height/100),2);
		
		System.out.printf("%s���� ���̴� %d�� Ű�� %.1f cm �̰� �����Դ� %.1f kg �Դϴ�. \n", name, age, height, weight);
		System.out.printf("����� ���� ����� BMI ������ = %.1f �Դϴ�.\n",bmi_index);
		
	}

}