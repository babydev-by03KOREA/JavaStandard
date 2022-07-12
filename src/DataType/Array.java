package DataType;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

//    결론!
//    저장할 데이터의 개수가 정해져 있고 /
//    삽입, 삭제 작업이 적고 /
//    특정 위치의 데이터를 조회하는 작업이 많다면 배열

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(arr[0]);

//      String - '' 사용불가!
        String[] weeks = {"F","U","C","K"};

//    배열의 값은 어떻게 접근할 수 있을까?
        System.out.println(weeks[2]);

//    배열의 길이는 고정되어 있다 / new String[]안에 갯수 반드시 작성해야된다!
        String[] arrFix = new String[7];
        arrFix[0] = "월";
        arrFix[1] = "화";
        arrFix[2] = "수";
        arrFix[3] = "목";
        arrFix[4] = "금";
        arrFix[5] = "토";
        arrFix[6] = "일";

//    배열의 길이
        for (String fix : arrFix) System.out.println(fix);

        String[] data = {"스위스","기러기","역삼역","토마토","인도인","우영우"};

//      ArrayList를 쉽게 생성하기
//      이미 관련 데이터 배열이 있다!
        ArrayList<String> uyu = new ArrayList<>(Arrays.asList(data));
        System.out.println(uyu);
    }
}
