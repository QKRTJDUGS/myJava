class Rabbit {
    // 객체의 속성(상태)을 나타내는 변수들입니다.
    public String shape;
    public int xPos;
    public int yPos;

    // 💡 [핵심] 기본 생성자 (Default Constructor)
    // 괄호() 안에 아무 값도 넣지 않고 객체를 만들 때 자동으로 실행됩니다.
    Rabbit() {
        shape = "토끼"; // 값을 안 주면 기본으로 "토끼"라는 모양을 가집니다.
    }

    // 💡 [핵심] 매개변수가 있는 생성자 (생성자 오버로딩)
    // 괄호(String value) 안에 글자를 넣고 객체를 만들 때 실행됩니다.
    Rabbit(String value) {
        shape = value; // 괄호 안에 넣어준 값으로 모양을 설정합니다.
    }

    // 토끼의 위치를 설정하는 메서드입니다.
    void setPosition(int x, int y){
        xPos = x;
        yPos = y;
    }
}

public class Code07_06 {
    public static void main(String[] args) {

        // 🚨 [수정 내용 1] 변수 이름 중복 오류 수정
        // 기존:
        // Rabbit rabbit = new Rabbit("원");
        // Rabbit rabbit = new Rabbit ();
        // 이유: 자바에서는 똑같은 이름의 변수(rabbit)를 두 번 선언할 수 없습니다.
        // 하나의 이름표는 하나의 객체에만 붙일 수 있습니다. 중복된 줄을 하나 지웠습니다.
        Rabbit rabbit = new Rabbit();

        // 각기 다른 모양을 가진 토끼 객체 3개를 만듭니다.
        // 이때 매개변수가 있는 생성자 'Rabbit(String value)'가 호출됩니다.
        Rabbit rabbit1 = new Rabbit("원");
        Rabbit rabbit2 = new Rabbit("삼각형");
        Rabbit rabbit3 = new Rabbit("토끼");

        // 각 토끼의 위치를 설정합니다.
        rabbit1.setPosition(100, 100);
        rabbit2.setPosition(-100, 100);
        rabbit3.setPosition(0, -100);

        // 🚨 [수정 내용 2] 줄바꿈 기호(\n) 추가 및 오타(객채->객체) 수정
        // 기존: ...입니다.", rabbit1.shape);
        // 수정: ...입니다.\n", rabbit1.shape);
        // 이유: printf를 사용할 때 \n을 넣지 않으면 모든 문장이 한 줄로 길게 이어져서 출력됩니다.
        System.out.printf("토끼1 객체의 기본 모양은 [%s]입니다.\n", rabbit1.shape);
        System.out.printf("토끼2 객체의 기본 모양은 [%s]입니다.\n", rabbit2.shape);
        System.out.printf("토끼3 객체의 기본 모양은 [%s]입니다.\n", rabbit3.shape);

        // 아무 값도 넣지 않고 만든 rabbit 객체의 모양을 출력합니다.
        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.\n", rabbit.shape);
    }
}
