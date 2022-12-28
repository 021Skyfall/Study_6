public class ThisMethod {
    public static void main(String[] args) {
        Example A = new Example();
        Example B = new Example(1);
    } // 아 그냥 출력하려면 인스턴스 생성만하면 실행되네 ㅋㅋ 이건 몰랏네 ㄷㄷ
}
class Example {
    public Example() {
        System.out.println("기본 생성자");
    };
    public Example(int a) {
        this();
        System.out.println("this 실행시 위 생성자로 이전 메소드 중복 호출");
    }
}
