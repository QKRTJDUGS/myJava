class Rabbit { // 클래스 이름을 Rabbit으로 통일
    String shape;
    int xPos;
    int yPos;
    static int count; // 모든 객체가 공유하는 클래스 변수

    Rabbit() { // 생성자 이름도 클래스와 동일하게 Rabbit
        count++;
    }
}

public class Code8_1 {
    public static void main(String[] args) {
        // 클래스 이름인 Rabbit으로 접근
        System.out.println("객체 생성 전의 총 토끼 수 ==>" + Rabbit.count);

        Rabbit rabbit1 = new Rabbit();
        System.out.println("토끼 객체1 생성 후의 총 토끼 수 ==>" + Rabbit.count);

        Rabbit rabbit2 = new Rabbit();
        System.out.println("토끼 객체2 생성 후의 총 토끼 수 ==>" + Rabbit.count);
    }
}