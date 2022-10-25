package DataType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAndMap {
    public static void main(String[] args) {
        // preparing list
        List<Map<String, Object>> list = new ArrayList<>();

        // map 객체 생성 후 학생정보 저장
        Map<String, Object> map = new HashMap<>();

        map.put("name", "박형주");
        map.put("department", "CS");
        map.put("id", "2420001");
        map.put("grade", "4.1");

        // list에 map 추가하기
        list.add(map);

        for(Map<String,Object> m :list) {
            System.out.println(m.get("name"));
            System.out.println(m.get("department"));
            System.out.println(m.get("id"));
            System.out.println(m.get("grade") + "\n");
        }
    }
}
