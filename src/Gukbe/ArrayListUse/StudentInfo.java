package Gukbe.ArrayListUse;

public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student(10001, "HJPark");
        student1.addSubject("Korean", 100);
        student1.addSubject("Math", 50);

        Student student2 = new Student(10002, "BGJang");
        student2.addSubject("Korean", 70);
        student2.addSubject("English", 80);
        student2.addSubject("Japanese", 40);

        student1.showScoreInfo();
        System.out.println("=====PORTAL SITE SCORE SERVICE=====");
        student2.showScoreInfo();
    }
}
