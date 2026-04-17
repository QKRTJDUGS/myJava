class Rabbit {
    public String shape;
    public int xPos;
    public int yPos;

    Rabbit() {
        shape = "토끼";
    }

    Rabbit(String value) {
        shape = value;
    }

    void setPosition(int x, int y){
        xPos = x;
        yPos = y;

    }
}

public class Code07_06 {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("원");

        Rabbit rabbit = new Rabbit ();

        Rabbit rabbit1 = new Rabbit("원");
        Rabbit rabbit2 = new Rabbit("삼각형");
        Rabbit rabbit3 = new Rabbit("토끼");

        rabbit1.setPosition(100, 100);
        rabbit2.setPosition(-100, 100);
        rabbit3.setPosition(0, -100);

        System.out.printf("토끼1 객채의 기본 모양은 [%s]입니다.", rabbit1.shape);
        System.out.printf("토끼2 객채의 기본 모양은 [%s]입니다.", rabbit2.shape);
        System.out.printf("토끼3 객채의 기본 모양은 [%s]입니다.", rabbit3.shape);

        System.out.printf("토끼 객채의 기본 모양은 [%s]입니다.", rabbit.shape);

    }

}
