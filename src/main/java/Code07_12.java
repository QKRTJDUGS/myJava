class Rabbit {

    public String shape;
    public int xPos;
    public int yPos;

    // 💡 [수정 내용 1] 메서드 이름 변경
    // 기존: public void setPosition(String shape)
    // 수정: public void setShape(String shape)
    // 이유: 아래 main 메서드에서 토끼의 모양을 정할 때 `setShape`라는 이름을 부르고 있습니다.
    // 모양(shape)을 저장하는 목적에 맞게, 그리고 main에서 부르는 이름과 똑같이 맞추기 위해 이름을 변경했습니다.
    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return this.shape;
    }

    public void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    public int getX() {
        return this.xPos;
    }

    public int getY() {
        return this.yPos;
    }
}

public class Code07_12 {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();

        // 💡 [수정 내용 2] 점(.) 연산자 추가
        // 기존: rabbit setShape ("흰토끼");
        // 수정: rabbit.setShape("흰토끼");
        // 이유: 자바에서 만들어진 객체(rabbit) 안에 있는 기능(메서드)을 사용하려면
        // 반드시 '객체이름.메서드이름()' 형태로 중간에 점(.)을 찍어주어야 합니다.
        rabbit.setShape("흰토끼");

        // 💡 [수정 내용 3] 점(.) 연산자 추가
        // 기존: rabbit setPosition (100, 100);
        // 수정: rabbit.setPosition(100, 100);
        // 이유: 위와 동일하게 점(.) 연산자가 누락되어 추가했습니다.
        rabbit.setPosition(100, 100);

        System.out.printf("토끼의 모양은 [%s]입니다.\n", rabbit.getShape());

        // 참고: rabbit. getY() 처럼 점 뒤에 띄어쓰기가 있어도 실행은 되지만,
        // 가독성을 위해 rabbit.getY() 처럼 붙여 쓰는 것이 더 좋습니다.
        System.out.printf("토끼의 위치는 (%d, %d)입니다.\n", rabbit.getX(), rabbit.getY());
    }
}