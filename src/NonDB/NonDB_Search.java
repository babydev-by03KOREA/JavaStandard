package NonDB;

import java.util.Arrays;
import java.util.Scanner;

public class NonDB_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Language = {"Java","Python","C#","Ruby"};
        boolean io = false;
        System.out.print("언어를 입력하세요 > ");
        String ILang = sc.nextLine();
        for (int i = 0; i<Language.length; i++){
            if (ILang.equals(Language[i])) {
                System.out.print("해당 언어의 라이브러리를 입력하세요. > ");
                String ILib = sc.nextLine();
                Language[i] = ILib;
                io = true;
            }
        }
        if (io) {
            System.out.println("언어 --> 라이브러리로 변경되었습니다!");
            System.out.println(Arrays.toString(Language));
        }else {
            System.out.println("해당언어는 지원하지 않습니다ㅠ");
        }
    }
}
