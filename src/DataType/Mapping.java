package DataType;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
//      HashMap<Key, Value>
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Nationality","Republic Of Korea");
        map1.put("Gender", "Male");

//      키에 해당하는 값을 get(가져오기)하는 방법
        System.out.println(map1.get("Nationality"));
//      없는 값을 달라고하면 null 반환
        System.out.println(map1.get("Java"));
//      null 싫고 다른 Default 값을 받고싶다면?
        System.out.println(map1.getOrDefault("Java","JSP+Servlet"));
        System.out.println(map1.containsKey("Gender"));
        System.out.println(map1.size());
        System.out.println("모든 키를 묶어서 출력하기 >>>");
        System.out.println(map1.keySet());
        System.out.println("모든 값을 묶어서 출력하기 >>>");
        System.out.println(map1.values());
        List<String> map2 = new ArrayList<>(map1.keySet());
        System.out.println("List로 자료형을 바꿔서 List<> 출력 >>>");
        System.out.println(map2);

        Map<String, Object> json = new HashMap<>();
        json.put("Writer","HJPark");
        json.put("Age","20");
        JSONObject jsonType = new JSONObject(json);
        System.out.printf("JSON Object: %s \n", jsonType);

        ArrayList<String> json2 = new ArrayList<>();
        json2.add("스위스");
        json2.add("기러기");
        json2.add("역삼역");
        json2.add("토마토");
        json2.add("우영우");

        Map<String, Object> map3 = new HashMap<>();
        map3.put("key1","value1");
        map3.put("key2","value2");
        map3.put("우영우 자기소개",json2);

        JSONObject jobj = new JSONObject(map3);
        System.out.printf("JSON_DATA: %s\n", jobj);
    }
}
