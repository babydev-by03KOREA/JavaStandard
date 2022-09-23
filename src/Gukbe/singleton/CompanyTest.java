package Gukbe.singleton;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        // static method 제공 필요 (ClassName.method())
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);
        System.out.println("같은 메모리 주소 참고중!");

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }
}
