package DataType;

public class Array {

//    배열의 길이는 고정되어 있다
//    배열의 값은 어떻게 접근할 수 있을까?
//    배열의 길이
//    빈번한 배열의 오류 - index 0부터 시작하는거 잘 생각할것.

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
    }
}
