package Gukbe.grade;

public class Student {
    int studentId;
    String studentName;

    Subject korean;
    Subject math;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korean = new Subject();
        math = new Subject();
    }

    public void setKorean(String name, int score) {
        korean.subjectName = name;
        korean.score = score;
    }

    public void setMath(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showScoreInfo() {
        int total = korean.score + math.score;
        System.out.println(studentName + " 님의 총 점수는 " + total + " 입니다.");
        if (total < 100) {
            System.out.println("교수: 학사경고일세.. 내 사무실로 오게나..");
        } else if (total <= 150) {
            System.out.println("교수: 이번학기도 무난하게 수고많았네");
        } else {
            System.out.println("교수: 자네.. 대학원.. 오지.. 않겠나..?");
        }
    }
}
