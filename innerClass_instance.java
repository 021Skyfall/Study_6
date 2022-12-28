public class innerClass_instance {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("↓ 외부 클래스를 사용해 내부 클래스 함수 호출");
        outer.testClass(); // 메인에서 출력할 때 외부 클래스의 메소드를 불러오면
                            // 외부 클래스가 내부 클래스의 메소드를 불러오고 출력이 됨
    }
}
class Outer { // 외부 클래스 선언
    private int num = 1; // 외부 클래스의 인스턴스 변수
    private static int sNum = 2; // 외부 클래스의 스태틱 변수

    private Inner inner; // 내부 클래스 참조 변수 선언

    public Outer() {
        inner = new Inner(); // 외부 클래스 생성자
    } // 문법 자체가 내부 클래스를 쓰려면 외부 클래스를 먼저 생성해야되고
      // 그래서 내부 클래스에는 static을 쓸 수 없음
    class Inner { // 인스턴스 내부 클래스
        int inNum = 10; // 내부 클래스의 인스턴스 변수
          // 정적 변수는 안됨

        void Test() {
            System.out.println("Outer num = " + num + " (외부 클래스의 인스턴스 변수)");
            System.out.println("Outer sNum = " + sNum + " (외부 클래스의 정적 변수)");
        } // 내부 클래스의 메소드
    }
    public void testClass() {
        inner.Test();
    } // 얘는 외부 클래스에서 내부 클래스를 불러온 외부 클래스의 메소드
      // 입력될 값은 외부 선언된 인스턴스랑 정적 변수에서 내부로 참조함 << 연관되어 있음을 뜻함
}

