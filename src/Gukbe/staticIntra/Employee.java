package Gukbe.staticIntra;

public class Employee {

    public static int serialNum = 1000;
    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }

    public static int getSerialNum() {
        /* static 메서드 안에서는 일반 맴버변수를 사용할 수 없습니다. 값이 준비되어지지 않았을 수 있기 때문에 */
        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
