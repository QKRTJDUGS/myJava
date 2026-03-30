package UniversityStudy;

import java.util.Scanner;

public class Code03_12 {

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("값을 입력하세요 : ");

        int num = s.nextInt();

        System.out.println( "1번 : " + ((num > 100) && (num < 200)));
        System.out.println( "2번 : " + ((num == 99) || (num == 100)));
        System.out.println( " 3번 : " + !(num == 100));

        s.close();
    }
}
