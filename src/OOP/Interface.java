package OOP;

class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Tiger extends Animal{}

class Lion extends Animal{}

class ZooKeeper{
//  입력값의 자료형이 다르면 메소드명을 동일하게 사용가능하다.
//  이것을 '메소드 오버로딩'이라고 한다!
    void feed(Tiger tiger){
        System.out.println("feed Apple");
    }
    void feed(Lion lion){
        System.out.println("feed Banana");
    }
}

public class Interface {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}
