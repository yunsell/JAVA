import java.util.Scanner;

public class Exam009_score_processing {
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
      }while (student_no < 1 || student_no > 20);

      System.out.println(student_no+"명의 국어,영어,수학 점수를 입력 받겠습니다.");

      name = new String[student_no];
      score = new int[student_no][3];
      total = new int[student_no];
      ranking = new int[student_no];

      String[] subjects = {"국어=>","영어=>","수학=>"};

      for(int i=0 ; i < student_no; i++){
         System.out.print("이름=>");
         name[i]=sc.next();

         for(int j=0; j <subjects.length; j++) {
            System.out.print(subjects[j]);
            score[i][j]=sc.nextInt();
            total[i] += score[i][j];
         }
         System.out.println();
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
            System.out.printf("%4d", score[i][j]);
         }
         System.out.printf("%4d %4.2f %4d \n", total[i], total[i]/(float)subjects.length,ranking[i]);
      }

   }

}
