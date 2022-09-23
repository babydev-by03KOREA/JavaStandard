package Gukbe.staticIntra;

public class CreateEmployee {
    public static void main(String[] args) {

        Employee em1 = new Employee();
        em1.setEmployeeName("박형주");

        System.out.println(Employee.getSerialNum());

        Employee em2 = new Employee();
        em2.setEmployeeName("장보근");

        /* 두가지 모두 증가하였다. 이걸 봤을때 두 개의 인스턴스가 하나의 메모리를 공유한다! */
        System.out.println(em1.getEmployeeName() + " 님의 사번은 " + em1.getEmployeeId() + " 입니다.");
        System.out.println(em2.getEmployeeName() + " 님의 사번은 " + em2.getEmployeeId() + " 입니다.");

    }
}
