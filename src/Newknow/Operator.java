package Newknow;

public class Operator {
    // 시험준비가 아니기때문에 연산자는 간단하게 알아보겠습니다.
    // equals객체는 사용자의 값을 비교할때(DB) 많이 사용됩니다. 반드시 숙지할것.

    public static void main(String[] args) {
        System.out.println(Math.round(3.141592));
        String str = "abc";
        System.out.println(str.equals("abc")); // T
        System.out.println(str.equals("ABC")); // F
        System.out.println(str.equalsIgnoreCase("ABC")); // T
        int x = 1;
        int y = 2;
        int result;
        int result1;
        result = (x > y) ? x : y ;
        System.out.println(result);
        // 아래에 식과 같습니다.
        if (x > y) {
            result1 = x;
            System.out.println(x);
        } else {
            System.out.println(y);
        }
        // lvalue(left value)는 리터럴이 '아니여야만' 한다. (값을 저장 할 수 있어야만함)

    }
}
