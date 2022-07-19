package OOP;

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void childMethod(){
        System.out.println("X = "+ x);
        System.out.println("this.x = " + this.x);
        //      super은 상속받은 Class를 가리킨다. (조상클래스)
        System.out.println("super.x = " + super.x);
    }
}

class Super {
    protected int x = 10;
    protected int y = 20;

    public Super(int x, int y){
        this.x = x;
        this.y = y;
    }
//  public Super() {}   ==> 기본생성자를 생성함. / Class명과 동일한 메소드(생성자)
//  이걸 잘 기억해둬야하는게 Spring에서 이런걸 xml파일이 대체하게됨. 개념을 모르면 못함..
}

class SuperGirl extends Super {
    protected int z = 30;

    public SuperGirl(){
        super(3,6);
    }
}

class HandPhone {
    protected String model;
    protected String number;

//    public HandPhone() {}
    public HandPhone(String model, String number){
        this.model = model;
        this.number = number;
    }
}

class FoldPhone extends HandPhone {
    protected String Battery;

//    public FoldPhone() {}
    public FoldPhone(String model, String number, String Battery){
//      부모클래스의 기본생성자를 Call!
        super(model, number);
        this.Battery = Battery;
    }

    public void sout() {
        System.out.println("핸드폰 모델: " + model + " 번호: " + number + " 베터리 :" + Battery);
    }
}

public class SuperMan {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        FoldPhone foldPhone = new FoldPhone("Iphone 12 Pro","A010003084", "3215mAh");
        foldPhone.sout();
    }
}
