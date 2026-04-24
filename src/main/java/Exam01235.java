public class Exam02 {
    public static void main(String[] args) {

        // 분석할 아주 긴 원본 로그 문장을 log라는 이름의 변수에 저장해 둡니다.
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";

        // 1. 자르기 시작할 위치(start) 구하기
        // indexOf("GET ")은 'G'가 몇 번째 칸에 있는지만 알려줍니다.
        // 우리가 진짜 자르기 시작해야 할 부분은 '/' 부터이므로, "GET "의 글자 수인 4칸을 더 뒤로 이동시킵니다.
        int start = log.indexOf("GET ") + 4;

        // 2. 자르기를 끝낼 위치(end) 구하기
        // 무작정 처음부터 찾으면 문장 맨 앞에 있는 엉뚱한 공백을 찾을 수 있습니다.
        // 그래서 방금 1번에서 구한 진짜 시작 위치(start)를 출발선으로 정해주고,
        // 거기서부터 오른쪽으로 탐색해 " HTTP"가 시작되는 공백의 위치를 찾습니다.
        int end = log.indexOf(" HTTP", start);

        // 3. 원하는 부분만 가위로 오려내기 (substring)
        // 자바의 substring 기능은 시작 위치부터 끝 위치 '바로 앞'까지만 잘라내는 특징이 있습니다.
        // 원본 글자(log)에서 우리가 구한 start부터 end 바로 앞까지만 쏙 오려내서 result에 담습니다.
        String result = log.substring(start, end);

        // 4. 화면에 결과물 보여주기
        // 오려낸 글자가 담긴 result를 화면에 출력하여 잘라내기가 성공했는지 확인합니다.
        System.out.println(result);

    }
}