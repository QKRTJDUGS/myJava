import java.util.Scanner;

public class Code05_08 {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int score;

        System.out.print("점수 입력 ==> :  ");
        score = s.nextInt();

        if (score >= 90) {
            System.out.println("자네 점수는 : A");
        }else if (score >= 80) {
            System.out.println("자네 점수는 : B");
        }else if (score >= 70) {
            System.out.println("자네 점수는 : C");
        }else if (score >= 60) {
            System.out.println("자네 점수는 : D");
        }else
            System.out.println("자네 점수는 : F");

        System.out.println("수고하셨습니다");

        s.close();
        }
    }
