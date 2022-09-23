package Gukbe.getSet;

public class BirthDay {

    private int year;
    private int month;
    private int day;
    private boolean isValid;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if ( month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate() {
        if(isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일" + "은 존재하는 날짜입니다.");
        } else {
            System.out.println(year + "년 " + month + "월 " + day +"일" + "은 존재하지 않습니다.");
        }
    }

}
