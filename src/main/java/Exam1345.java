public class Exam1345 { // 파일명과 동일하며 누구나 접근 가능한(public) 클래스 선언
    public static void main(String[] args) { // 객체 생성 없이(static), 반환값 없는(void) 프로그램의 진입점(main)

        // 1. 원본 데이터 준비: 추출할 대상이 되는 전체 로그 문장을 String 변수 log에 저장합니다.
        // (주의: 문자열 안의 큰따옴표("GET...")를 코드로 인식시키기 위해 역슬래시(\")를 함께 썼습니다.)
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";

        // 2. 문자열 분리 (Split): 긴 문자열을 공백(" ")을 기준으로 토막 내어 parts라는 배열(서랍장)에 순서대로 담습니다.
        String[] parts = log.split(" ");

        // 3. 데이터 추출 및 출력: 공백으로 토막 난 조각들 중, 타겟 URL이 위치한 6번 인덱스(7번째 조각)만 콕 집어서 출력합니다.
        System.out.println(parts[6]);

    } // main 메소드 끝
} // Exam02 클래스 끝