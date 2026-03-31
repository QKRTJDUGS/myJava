import java.util.Scanner;

public class Exam02 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int a;
        a = s.nextInt();

        System.out.println("숫자를 입력하세요 : ");

        if (a % 3 == 0) {
            System.out.println("3의 배수입니다");
        } else (a % 5 == 0) {
            System.out.println("5의 배수입니다.");
        }

        s.close();
    }
}
