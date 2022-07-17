package OOP;

class Animal2 {
    String name;
    void setName(String name) {
        this.name = name;
    }
//  Object animal = new Animal();과 같다!
}

class Dog extends Animal2 {
    Dog(){
//       Default 생성자.
    }
    void sleep(){
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Animal2 {
//  생성자
    HouseDog(String name){
        this.setName(name);
    }
//  생성자의 오버로딩
    HouseDog(int type){
        if (type == 1){
            this.setName("Welsh");
        }else{
            this.setName("Default");
        }
    }

    void sleep() {
        System.out.println(this.name + " zzz");
    }
//  메소드의 오버라이딩! (메소드의 덮어쓰기)
    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class Constructor {
    public static void main(String[] args) {
//      IS-A 관계 == 상속관계!
//      Animal2 animal2 = new Dog(); == Dog is a animal2
//      자식 인스턴스명 = new 부모(); !Error 부모 클래스로 만든 객체는 자식 클래스의 자료형으로 사용불가.
        HouseDog houseDog = new HouseDog("호두");
//      new 키워드가 사용될 때 호출된다.
        HouseDog houseDog1 = new HouseDog(1);
        houseDog.setName("호두");
        houseDog.sleep();
        houseDog.sleep(3);
        System.out.println(houseDog1.name);
    }
}
