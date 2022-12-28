public class innerClass_local {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.test();
        // 호출 문법은 인스턴스와 같음
    }
}
class Outer2 {
    int num = 21;
    void test() {
        int num1 = 31;
        class localInner { // 지역 내부 클래스
            void getPrint() { // 내부 클래스 메소드
                System.out.println(num);
                System.out.println(num1);
            }
        }
        localInner localinner = new localInner(); 
        // 얘도 인스턴스 내부 클래스랑 마찬가지로 외부 클래스에서 생성해서 사용하는데
        // 문제는 얘는 외부 클래스의 메소드 안에 생성함 > 그래서 지역 내부 클래스 인가봄
        localinner.getPrint();
    }
}
