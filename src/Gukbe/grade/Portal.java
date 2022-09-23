package Gukbe.grade;

public class Portal {

    public static void main(String[] args) {
        Student hyeongju = new Student(22017048, "박형주");
        hyeongju.setKorean("국어", 100);
        hyeongju.setMath("수학", 70);
        hyeongju.showScoreInfo();
    }
}
