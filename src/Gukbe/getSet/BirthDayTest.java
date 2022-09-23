package Gukbe.getSet;

public class BirthDayTest {
    //    public open시, 직접접근으로 없는 값을 넣을 수 있으므로 getter/setter 사용합니다.

    public static void main(String[] args) {
        BirthDay birthDay = new BirthDay();

        birthDay.setYear(2003);
        birthDay.setMonth(11);
//      false는 0이므로 0월로 출력됨.
        birthDay.setDay(22);

        birthDay.showDate();
    }

}
