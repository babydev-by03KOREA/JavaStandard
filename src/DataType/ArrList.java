package DataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*  결론!
* 저장할 데이터의 개수가 미정이고 /
* 삽입, 삭제 작업이 많고 /
* 특정 위치 데이터를 조회하는 경우가 별로 없다면 리스트
* */

public class ArrList {
    public static void main(String[] args) {
//        ArrayList pitch = new ArrayList();    ----> 자료형을 명확하게 표기할것을 권고함.
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("Array랑 ArrayList는 다릅니다!");
        pitches.add("그럼 인도네시아랑 인도는 같은나랍니까?");
        pitches.add("공부 안하셨습니까?");
        pitches.add("real");
        System.out.println(pitches.get(0));
        System.out.println(pitches.get(1));
        System.out.println(pitches.get(2));
        System.out.println("제 사이즈는 " + pitches.size() + " 입니다.");
        System.out.println(pitches.contains("real"));
//      remove(객체)
        System.out.println("우영우가 한 대화를 지울게요. 결과값: " + pitches.remove("공부 안하셨습니까?"));
        System.out.println("지워졌나요? 결과값: " + pitches.contains("공부 안하셨습니까?"));

        ArrayList generics = new ArrayList();
        generics.add("우영우");
        generics.add("동그라미");

        System.out.println("제네릭스를 사용하지 않는방법");
//      모두 Object로 인식하기 때문에 Casting(형변환)이 필요함.
        String al1 = (String) generics.get(0);
        System.out.println(al1);

        ArrayList<String> add = new ArrayList<>(Arrays.asList("우영우","역삼역","기러기"));
//      delimiter: 구분자 / String.join("구분자", 리스트객체)
        String result = String.join("+", add);
        System.out.println(result);

        String[] number = {"120","130","90","88"};
        ArrayList<String> num = new ArrayList<>(Arrays.asList(number));
        num.sort(Comparator.naturalOrder());
        System.out.println("오름차순");
        System.out.println(num);
        num.sort(Comparator.reverseOrder());
        System.out.println("내림차순");
        System.out.println(num);
    }
}
