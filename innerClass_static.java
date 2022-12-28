public class innerClass_static {
    public static void main(String[] args) {
        Outer1.StaticInner outer1= new Outer1.StaticInner(); // 정적 내부 클래스의 객체 생성
        outer1.test();
    }
}
class Outer1 { // 외부 클래스
    private int num = 1;
    private static int snum = 2;

    void getPrint() {
        System.out.println("인스턴스 메소드");
    }
    static void getPrintStatic() {
        System.out.println("스태틱 메소드");
    }
    static class StaticInner { // 정적 내부 클래스
        void test() {
            System.out.println("Outer num = " +snum+" (외부 클래스의 정적 변수)");
            getPrintStatic();
        } 
    } // 외부 클래스의 인스턴스 변수와 인스턴스 메소드는 정적 멤버가 아니라 사용불가
}
// 얘는 결국 외부 클래스에서도 static 선언된 정적 변수만을 참조할 수 있고 외부 클래스에서
// 생성해주지 않아도 호출이 가능함
// 대신 메인 클래스에서 호출할 때는 정확한 위치를 찍어줘야함
