public class Exam03 {
    public static void main(String[] args){


        for (int i=1; i<=7; i++){
            int c;

            if(i<= 4) {
                c = i;
            } else {
                c = 8 - i;
            }
            for (int j = 1; j<=c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
