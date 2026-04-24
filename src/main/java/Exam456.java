public class Exam456 { // 파일명(Exam.java)과 동일해야 하는 공개된(public) 클래스 선언
    public static void main(String[] args) { // 자바 프로그램이 객체 생성 없이 가장 먼저 실행되는 진입점

        // 웹 서버 로그 원본 데이터를 담은 문자열(String) 변수 선언 및 데이터 할당
        String log = "127.0.0.1 - - [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326";

        // "GET "의 위치를 찾고, 해당 글자 수(4)만큼 더해 우리가 추출할 타겟('/')의 시작 위치를 구함
        int start = log.indexOf("GET ") + 4;

        // 위에서 구한 start 위치부터 검색을 시작하여, 타겟 직후에 오는 " HTTP"의 첫 글자(공백) 위치를 구함
        int end = log.indexOf(" HTTP", start);

        // 원본 문자열에서 start 위치부터 end 위치 직전까지의 구간만 잘라내어 새로운 문자열 변수에 저장
        String result = log.substring(start, end);

        // 최종적으로 추출된 결과값(/apache_pb.gif)을 화면에 출력하고 줄바꿈
        System.out.println(result);

    } // main 메서드의 실행 범위가 끝남을 알리는 닫는 중괄호
} // Exam 클래스의 설계 범위가 끝남을 알리는 닫는 중괄호