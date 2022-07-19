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

public class IteratorType {
    public static void main(String[] args) {
//      Collection 생성
//      ArrayList<String> aircraft = new ArrayList<>();
        Set<String> aircraft = new HashSet<>();
        aircraft.add("A380");
        aircraft.add("B747");
        aircraft.add("A350");
        aircraft.add("B777");

//      Iterator 획득!
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
