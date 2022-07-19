package DataType;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Map의 Key-Value 모음에서 반복문이 필요할때 사용!
// Map 은 키-값 쌍으로 데이터를 저장하는 데 사용되는 인터페이스 인 반면
// HashMap 은 Map 인터페이스의 구현 클래스입니다.

public class MapEntry {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("1","TYO");
        hashMap.put("2","CGK");
        hashMap.put("3","LAX");

    /*  향상된 for문
    *   for(변수타입 변수 : 배열이름) {
    *       실행부분
    *   }
    * */

//      Entery는 두개의 데이터가 쌍으로 존재할 때 두 자료형을 묶는 자료형입니다.
        System.out.println("변경전");
        System.out.println("entrySet()은 key와 Value 모두 출력");
        System.out.println("keySet()은 key값만 출력!");
        for (Entry m : hashMap.entrySet()) {
            System.out.printf("[GATE 번호 : %s\t도착공항 : %s]\n", m.getKey(), m.getValue());
        }

        for (Entry m : hashMap.entrySet()) {
            if (m.getValue().equals("TYO")) {
                m.setValue("NRT");
            }
        }

        System.out.println("변경후");
        for (Entry m : hashMap.entrySet()) {
            System.out.printf("[GATE 번호 : %s\t도착공항 : %s]\n", m.getKey(), m.getValue());
        }

/* Entry => <K,V>묶음 / String과 String을 묶어줬음!
* set 가방에는 Entry 자료형의 요소만이 들어올 수 있고
* hasMap.entrySet();를 통해 hasMap안의 key-value요소를 가져와 set에 넣어줍니다.
*/
        Set<Entry<String, String>> set = hashMap.entrySet();

//      iterator또한 제네릭을 entry로 설정해주고 set.iterator()로 등록합니다.
        Iterator<Entry<String, String>> iterator = set.iterator();

//      hasNext() => 가져올 iterator이 더이상 없을때까지! / jsp 프로그래밍의 rs.next()와 비슷!
        while(iterator.hasNext()){
            /*
            *  iterator.next()로 하나씩 가져오는 데이터는 모두 Entry<String, String> (묶음)자료형입니다.
            *  때문에 temp의 자료형도 Entry<String, String>으로 선언해줍니다.
            *  그리고 가져온 temp를 토대로 temp.getKey(), temp.getValue()를 통해 key와 value데이터에 각각 접근합니다.
            * */
            Entry<String, String> temp = iterator.next();
            System.out.printf("GateNo. =>  %s\t 도착공항 => %s\t", temp.getKey(), temp.getValue());
        }
    }
}
