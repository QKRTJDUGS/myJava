public class Practice_02 {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            int a;

            if (i <= 4) {
                a = i;
            } else {
                a = 8 - i;
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

