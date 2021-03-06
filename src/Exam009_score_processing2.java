import java.util.Scanner;

public class Exam009_score_processing2 {
   public static void main(String[] args) {
      String[] name;
      int[][] score;
      int total[];
      int student_no;
      int ranking[];

      Scanner sc = new Scanner(System.in);

      //처리할 학생의 인원 수를 입력받는다.

      do {
         System.out.print("처리할 학생수는=");
         student_no=sc.nextInt();
      }while (student_no < 1 || student_no > 100);

      System.out.println(student_no+"명의 국어,영어,수학 점수를 랜덤으로 생성합니다.");

      name = new String[student_no];
      score = new int[student_no][3];
      total = new int[student_no];
      ranking = new int[student_no];

      String[] subjects = {"국어=>","영어=>","수학=>"};

      for(int i=0 ; i < student_no; i++){
         name[i]=Integer.toString(i+1); // 학생수 입력

         for(int j=0; j <subjects.length; j++) {
            score[i][j]=(int) (Math.random()*100) + 1; // 랜덤 점수 생성
            total[i] += score[i][j];
         }
      }      

      //랭킹 구하는 부분은 꼭 외우기!코딩 문제에 단골 출제!
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
         System.out.printf("합계:%d 평균:%4.2f 랭킹:%d \n", total[i], total[i]/(float)subjects.length,ranking[i]);
      }

   }

}
