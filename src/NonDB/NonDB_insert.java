package NonDB;

import java.util.Scanner;

public class NonDB_insert {
    public static void main(String[] args) {
        String[] arr = new String[100];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("듣고싶은 노래를 입력하세요. 그만하고싶으면 stop 입력");
        while(true) {
            System.out.print(">");
//          nextLine() ---> 공백도 받음.
            String song = sc.nextLine();
//          멈춰 라는 문자열의 입력이 있으면 break;
            if (song.equals("stop")) break;
//          arr[0]에 song 입력값을 할당함.
            arr[count] = song;
//          0++
            count++;
        }

        System.out.println("듣고싶은 노래 >>> ");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
//          arr[-1]라면(arr[0]가 끝) break;
            if (i == count-1) break;
        }
    }
}
