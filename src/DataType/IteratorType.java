package DataType;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Iterator이 뭐누..?
* iterator는 ArrayList, HashSet과 같은 컬렉션을 반복하는 데 사용할 수 있는 객체다.
* iterator는 반복의 기술 용어기 때문에 반복자라고 한다
* /

/* Iterator의 장점!
* 1. next() 및  previous()를 써서 앞뒤로 움직이기 가능!
* 2. hasNext()를 써서 더 많은 요소가 있는지 확인가능!
*/

/* Set 자료형도 알아보자!
* HashSet은 Set 컬렉션을 구현하는 대표적인 클래스이다.
* 데이터를 중복 저장할 수 없고 순서를 보장하지 않는다.
* Set은 인덱스로 객체를 관리하지 않기 때문에 데이터를 검색하기 위해서는 iterator() 메서드로
* Iterator(반복자)를 생성하고 데이터를 가져와야 한다.
* */

public class IteratorType {
    public static void main(String[] args) {
//      Collection 생성
//      ArrayList<String> aircraft = new ArrayList<>();
//      Set => 중복생성은 막아줄게 대신 순서는 내맘대로다?
        Set<String> aircraft = new HashSet<>();
        aircraft.add("A380");
        aircraft.add("B747");
        aircraft.add("A350");
        aircraft.add("B777");

//      Iterator 획득! / 반복자 생성!
        Iterator<String> iterator = aircraft.iterator();

//      while문을 사용한경우
        System.out.println("while문 사용하여 출력");
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

//      for-each문을 사용한경우
        System.out.println("for-each로 출력");
        for (String str : aircraft) {
            System.out.println(str);
        }
    }
}
