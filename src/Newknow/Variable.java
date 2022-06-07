package Newknow;

import java.util.*;

public class Variable {
    // constant, 상수 / 한 값을 저장하면 다른 값으로 변경할 수 없다. (JS의 const)
    // final만 붙여주면 사용 가능하다. 단, 선언과 동시에 초기화 작업이 이뤄져야한다.
    // final int Mx; (Error), 선언된 값은 변경할 수 없음(그러라고 쓰는거임..)
    // literal, 리터럴 / Retural이 아니다!
    // 상수 == 한번 정하면 변경할 수 없는 값 == literal
    final int Max_Value = 10;
    final boolean Passed = true;
    final long big = 100_000_000_00L;
    final int finger = 10;
    char ch = 'A';
    String input;
    int num;
    int code = (int)ch;
    // 큰따옴표 == "\"" / 작은따움표 == '\'' ('''불가)
    // byte(1) < short(2) < int(4) < long(8)
    // 형변환 DATA / 보수값 등은 알아보지 않겠다
    double d = 3.14;
    int pi = (int)d;

    public static void main(String[] args) {
        Variable vab = new Variable();
        Scanner scanner = new Scanner(System.in);
        // 줄바꿈 문자는 %n, \n 모두 가능하지만 OS마다 다를 수 있으니 %n으로 작성하는것이 좋다.
        System.out.printf("정수형 리터럴 변수값: %d%n", vab.Max_Value);
        System.out.printf("박형주님의 시험결과는 %b입니다.%n",vab.Passed);
        System.out.printf("자바에서 Long 출력은 처음입니다. 값: %d%n",vab.big);
        System.out.printf("[빈칸 5개]로 손가락값을 뽑습니다. [%5d]%n", vab.finger);
        System.out.printf("[0*5]로 손가락값을 뽒습니다. [%05d]%n", vab.finger);
//        System.out.print("숫자값을 입력하세요 >>> ");
//        vab.input = scanner.nextLine();
//        vab.num = Integer.parseInt(vab.input);
//        System.out.println("입력하신 String값은 다음과 같습니다 : " + vab.input);
//        System.out.printf("IntegerNum: %d%n", vab.num);
//        System.out.println("---------------------------");
        System.out.println(vab.ch);
        System.out.printf("%c=%d(%#X) %n", vab.ch, vab.code, vab.code);
        System.out.printf("소수점 파이값 : %f%n", vab.d);
        System.out.printf("소수점 날린 파이값 : %d%n", vab.pi);

    }
}

