public class ThisKeyword {
    public static void main(String[] args) {

    }
}
class Con {
    int x;
    int y;
    Con() {
        System.out.println(1);
    };
    Con(int x) {
        this();
        System.out.println(2);
    }
    Con(int a, int b) {
        this.x = a;
        this.y = b;
    }
}
