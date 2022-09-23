package Gukbe.encapsulation;

public class makeReport {

    StringBuffer buffer = new StringBuffer();   // 문자열을 붙여서 사용하는 방법

    private String line = "=================WELCOME TO JAVA WORLD!=================\n";
    private String title = "  이름\t   주소 \t\t 전화번호   \n";
    private void makeHeader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody() {
        buffer.append("hyeongju \t");
        buffer.append("south Korea \t");
        buffer.append("010-8693-9008 \n");
    }

    private void makeFooter() {
        buffer.append(line);
    }

    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}
