import java.util.Scanner;

public class UpDown2 {

	public static void main(String[] args) {
		System.out.printf("숫자를 입력해주세요 1~100");
		int min=0, max=100, guess_num=0, cnt=0;
		int ran = (int) (Math.random() * 100) + 1;
		Scanner input = new Scanner(System.in);

		while (guess_num != ran) {
			guess_num = input.nextInt();
			cnt +=1;
			if (guess_num == ran) 
			{
				System.out.printf("축하합니다 " + guess_num + "은 정답입니다.", cnt + "회");
				break;
			}
			
		else if (guess_num < ran) 
		{
			min=guess_num;
		}
		else 
		{
			max=guess_num;
		}
		System.out.printf("%d ~ %d 사이에있습니다. \n", min, max);
		}  
	}
}