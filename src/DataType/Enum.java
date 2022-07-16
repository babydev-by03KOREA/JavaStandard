package DataType;

import java.util.ArrayList;
import java.util.Arrays;

// 계절은 봄,여름,가을,겨울 이렇게 4가지로 고정값이다. 이럴때 enum을 사용하면 좋다.
enum Season {spring, summer, fall, winter}
enum Arm {m1, m1_Air, m1_Pro, m1_Max}

public class Enum {
    public String mac;
    public String chipset;

    public static void main(String[] args) {
        Arm arm = Arm.m1;
        System.out.println(arm);
        System.out.println(Arm.m1_Max);

        System.out.println("enum Arm{}의 자료형 확인: " + arm.getClass().getName());

        Enum e = new Enum();
        e.mac = "MacBookPro 16\"";
        e.chipset = String.valueOf(Arm.m1_Max);

        System.out.println("고객님께서 구매하신 Mac 상품은 " + e.mac + " 입니다.");
        System.out.println("이 Mac PC에서 사용된 Chipset은 " + e.chipset + " 입니다.");
        System.out.println("mac의 자료형 확인: " + e.mac.getClass().getName());

        Season season = Season.spring;
//      같은 Season 객체를 참고하고 있기 때문에 가능하다!
        System.out.println(season == Season.spring);
        System.out.println("name()메소드는 열거 객체가 가지고 있는 문자열을 리턴한다.(아래참고)");
        System.out.println(season.name());
        System.out.println("Ordinal()메소드는 몇번째 열거 객체인지 알려준다. 0부터 시작.(아래참고)");
        System.out.println(season.ordinal());
        System.out.println("순서대로 뱉어냅니다.");
        for (Season sea : Season.values()) {
            System.out.println(sea);
        }
    }
}
