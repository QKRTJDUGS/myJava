import java.util.Scanner;

public class Code05_08 {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int score;

        System.out.println("점수 입력 ==>");
        score = s.nextInt();

        if (score >= 90) {
            System.out.println("A");
        }else if (score >= 80) {
            System.out.println("B");
        }else if(score >= 70); {
            System.out.println("C");

        }
    }
}
