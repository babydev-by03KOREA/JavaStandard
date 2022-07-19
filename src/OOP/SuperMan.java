package OOP;

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void childMethod(){
        System.out.println("X = "+ x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}

/* super는 자식 클래스가 부모 클래스로부터 상속받은 멤버를 참조할 때 사용하는 참조 변수이다.
* super = 부모님 모시고와.   this = 동명이인 중에 지금 여기에 있는 박형주씨 나오세요.
* 클래스 내의 맴버변수와 지역변수의 이름이 같은 경우 구분을 위해 this를 사용한다. */

class Point {
    int x = 10;
    int y = 20;
    /* 생성자의 첫줄에 다른 생성자를 호출하지 않았기 때문에
    * 컴파일러가 이 부분에 super()을 호출합니다.
    * 부모 클래스이므로 Object 클래스의 super()이 호출됩니다. */
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z = 30;
    /* 생성자 내부에서만 사용할 수 있고,
    *  같은 클래스의 다른 생성자를 호출할 때 사용한다. */
    Point3D() {
//      같은 클래스에서 다른 생성자를 호출한다.
//      메소드명이 클래스명과 동일하고 리턴 자료형을 정의하지 않는 메소드를 생성자(Constructor)라고 한다.
        this(100, 200, 300);
    }

    Point3D(int x, int y, int z) {
//      부모 클래스의 Point(int x, int y)를 호출한다.
        super(x,y);
        this.z = z;
    }
}

public class SuperMan {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        Point3D point3D = new Point3D();
        System.out.println("point3d.x = " + point3D.x);
        System.out.println("point3d.y = " + point3D.y);
        System.out.println("point3d.z = " + point3D.z);
    }
}
