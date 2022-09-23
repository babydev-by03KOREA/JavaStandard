package Gukbe.encapsulation;

public class mainReport {
    public static void main(String[] args) {
        makeReport builder = new makeReport();
        String report = builder.getReport();

        System.out.println(report);
    }
}
