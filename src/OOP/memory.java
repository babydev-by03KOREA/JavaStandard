package OOP;

class mem {
    public static String hello = "안녕하세요 스테틱 스트링이에요";
    public String hi = "안녕하세요 그냥 스트링이에요";
    public static void move(){
        System.out.println(hello);
//        System.out.println(hi);
    }
    public void go(){
        System.out.println(hello);
        System.out.println(hi);
//        인스턴스 변수에서는 모두 접근 가능하다!
    }
}

public class memory {
    public static void main(String[] args) {
        System.out.println(mem.hello);
//        System.out.println(mem.hi);
//        인스턴스는 인스턴스를 통해서만 접근이 가능함.
        mem.move();
//        mem.go();
//        마찬가지
    }
}
