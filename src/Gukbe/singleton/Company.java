package Gukbe.singleton;

public class Company {

    /*
    * 생성자를 하나도 지정하지 않으면? > Default 생성자를 만들어줌 / 외부에서 마음대로 compiler가 생성하지 않도록 private로 선언
    * 유일한 단 하나이기 때문에 static으로 선언 / instance < 변수명
    */

    // 유일한 객체를 선언해줌 / 외부에서 참조할땐 클래스명.getInstance();
    private static Company instance = new Company();

    private Company() {}

    public static Company getInstance() {

        if (instance == null) {
            // 그럴일은 없겠지만, 방어적인 코드를 작성함.
            instance = new Company();
        }

        return instance;
    }
}
