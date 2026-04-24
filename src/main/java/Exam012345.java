public class Exam012345{//공개적인 exm02과 이름이 같아야하는 자바의 class 선언
    public static void main(String[]args) {//공개적인 객체 생성하지 않고, 반환도 없는 main(메소드)

        String log = "127.0.0.1 - frank ~~[10/otc/3235:] GET /apache_pb.gif HTTP/1.0 200";
        // 문자열 변수를 선언하고 변수에 로그 값을 대입함.
        int start = log.indexOf("GET ") + 4;
        //int start에 로그를
        int end = log.indexOf("HTTP", start);

        String result = log.substring(start, end);

        System.out.println(result);
    }


}