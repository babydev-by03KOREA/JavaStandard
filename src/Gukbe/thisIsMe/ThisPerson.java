package Gukbe.thisIsMe;

public class ThisPerson {
    String name;
    int age;

    public ThisPerson() {
        /*  int num =10; String name = "어쩌구"; this 위에 쓸 수 없습니다! */
        this("no name in here", 1);
    }

    public void showPerson() {
        System.out.println(name + ", " + age);
    }

    public ThisPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ThisPerson getPerson() {
        return this;
    }

    public static void main(String[] args) {
        ThisPerson thisPerson = new ThisPerson();
        thisPerson.showPerson();

        System.out.println("package.class@Address\t" + thisPerson);

        ThisPerson person2 = thisPerson.getPerson();
        System.out.println("package.class@Address\t" + person2);

        System.out.println("같은 값을 참고하네요~ 아름 다운 세상~");
    }
}
