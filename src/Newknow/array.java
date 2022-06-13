package Newknow;

public class array {
//    0부터 배열길이 -1까지
//    변수[배열 index] = 숫자 => 저장만 시킨거!
//    자료형 변수명 = 변수[배열 index] => 저장된 값을 변수에 저장!
    public static void main(String[] args) {
        int[] score;   // int 타입의 배열을 다루기 위한 참조변수 선언
        score = new int[5];  // int 타입의 값 5개 저장가능
        score[3] = 100; // 4번째에 100을 저장
        int value = score[3];   // 4번째 요소에 저장된 값을 변수에 저장
        System.out.println(value);
//        노가다로 score[0] = 10; 이렇게 할 수도 있지만, for 문으로 10씩 값을 후증감시켜보겠다.
        for (int i = 0; i < 5; i++){
            score[i] = i * 10;  // score에 index * 10값 저장
            int tmp = score[i]; // 저장된 값들을 변수에 저장
            System.out.println(i);  // 인덱스 출력
            System.out.println(tmp);    // 인덱스 * 10값 출력
        }
//        배열이름.length를 사용하여 조건을 적는것이 좋음. 실수방지
        for (int i = 0; i < score.length; i++){
            System.out.printf("저장된 값 출력 출력: %d %n",score[i]);   // 자바는 호이스팅이 안됨.
            System.out.printf("자릿수를 출력하고싶으면 i만 쓰시면 됩니다. 자릿수: %d %n", i);
//            i는 지역변수로, 밖에서 써봤자 에러뜹니다.
        }
//        Array Length
        int[] arr = new int[5]; // 선언 시, 자료형에도 '[]' 붙여주세요. String[]도 마찬가지
//        5개가 있다는거지 index 범위도 5까지라는게 아님. 0~4임을 기억하자!
        int[] arr0 = new int[0];    // 길이가 0인 배열도 생성가능하다.
        int tmp = arr.length;   // int[] arr = new int[5] arr.length ==> Error / 배열의 길이는 변경불가.
        System.out.printf("arr 배열의 길이: %d", tmp);
    }
}
