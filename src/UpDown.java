import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {

		System.out.println("=================== ���ٿ� ����! Ƚ�� 20���ȿ� ! ===================");
		System.out.println("������ 1~100���� �Դϴ� ���ڸ� �Է����ּ���.");
		int ans = 0;
		int hint = 20;
		int des = (int) (Math.random() * 100) + 1; //1~100 ���� ���� ��
		Scanner input = new Scanner(System.in);
		//System.out.println(des);
		while (true) {
			ans = input.nextInt();
			hint--;
			System.out.println("����Ƚ�� "+hint+" ȸ");
			if(ans < des) {
				System.out.println("�Է��� ���� " + ans + "�Դϴ�. ���亸�� ���� �����ϴ�!" );
			}else if(ans > des) {
				System.out.println("�Է��� ���� " + ans + "�Դϴ�. ���亸�� ���� �����ϴ�!" );
			}else if(hint==0){
				System.out.println("���� ��ȸ�� ��� ����ϼ̽��ϴ�. ���ӿ���~");
				break;
			}else {
				System.out.println("�����մϴ�. �����Դϴ�!" );
				break;
			}
		}
		input.close();


	}
}
