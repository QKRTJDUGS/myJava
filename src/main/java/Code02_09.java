package UniversityStudy;

public class Code02_09 {
    public static void main(String[] args){
        int number1 = 10, number2 =20;
        int resAdd;
        int resSub;
        int resMul;
        double resDiv;

        resAdd = number1 + number2;
        resSub = number1 - number2;
        resMul = number1 * number2;
        resDiv = (double) number1 / number2;

        /* 여기 위에 보면 resdiv 보면 지금 상태가 이상하다고 노란색으로 뜸
        왜냐면 숫자를 reDiv 숫자 저장하는 건데 정수만 저장 근데 지금 0만 저장된거

        그래서 (double) : 실수의 형태로 바꾼거임 강제로
         */

        System.out.println(number1 + "+" + number2 + "=" + resAdd);
        System.out.println(number1 + "-" + number2 + "=" + resSub);
        System.out.println(number1 + "x" + number2 + "=" + resMul);
        System.out.println(number1 + "/" + number2 + "=" + resDiv);
    }
}
