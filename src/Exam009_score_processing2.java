import java.util.Scanner;

public class Exam009_score_processing2 {
   public static void main(String[] args) {
      String[] name;
      int[][] score;
      int total[];
      int student_no;
      int ranking[];

      Scanner sc = new Scanner(System.in);

      //ó���� �л��� �ο� ���� �Է¹޴´�.

      do {
         System.out.print("ó���� �л�����=");
         student_no=sc.nextInt();
      }while (student_no < 1 || student_no > 100);

      System.out.println(student_no+"���� ����,����,���� ������ �������� �����մϴ�.");

      name = new String[student_no];
      score = new int[student_no][3];
      total = new int[student_no];
      ranking = new int[student_no];

      String[] subjects = {"����=>","����=>","����=>"};

      for(int i=0 ; i < student_no; i++){
         name[i]=Integer.toString(i+1); // �л��� �Է�

         for(int j=0; j <subjects.length; j++) {
            score[i][j]=(int) (Math.random()*100) + 1; // ���� ���� ����
            total[i] += score[i][j];
         }
      }      

      //��ŷ ���ϴ� �κ��� �� �ܿ��!�ڵ� ������ �ܰ� ����!
      for (int i=0; i<student_no;i++)
         ranking[i]=1;

      for (int i=0; i<student_no-1; i++) {
         for (int j=i+1; j <student_no; j++) {
            if(total[i] > total[j])
               ranking[j]++;
            else if (total[i]<total[j])
               ranking[i]++;
         }
      }
      //////////////////////////////////////////
      for(int i=0; i<student_no; i++) {
         System.out.print(name[i]+"\t");
         for (int j=0; j<score[i].length; j++) {
            System.out.printf("%4d\t", score[i][j]);
         }
         System.out.printf("�հ�:%d ���:%4.2f ��ŷ:%d \n", total[i], total[i]/(float)subjects.length,ranking[i]);
      }

   }

}
