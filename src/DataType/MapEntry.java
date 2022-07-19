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

        Set<Entry<String, String>> set = hashMap.entrySet();

        Iterator<Map.Entry<String, String>> iterator = set.iterator();

        while(iterator.hasNext()){
            Map.Entry<String, String> temp = iterator.next();
            System.out.printf("GateNo. =>  %s\t 도착공항 => %s\t", temp.getKey(), temp.getValue());
        }
    }
}
