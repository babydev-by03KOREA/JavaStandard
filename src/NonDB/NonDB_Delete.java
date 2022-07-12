package NonDB;

import java.util.Scanner;

public class NonDB_Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String food[] = {"치킨", "피자", "떡볶이", "마라탕", "꿔바로우"};
        System.out.print("못먹는(싫어하는) 음식을 입력하세요 > ");
        String dfood = sc.nextLine();

        int count = food.length;
        boolean YorN = false;

        for (int i = 0; i < count; i++) {
            if (dfood.equals(food[i])) {
                System.out.println(dfood + "를 삭제합니다.");
                for (int j = i; j < count - 1; j++) {
                    food[j] = food[j + 1];
                }
                count--;
                YorN = true;
                break;
            }
        }

        if (YorN) {
            System.out.println("====삭제 후 정보====");
            for (int i = 0; i < count; i++) {
                System.out.println(food[i] + " ");
            }
            System.out.println("==================");
        }else {
            System.out.println("삭제할 음식이 없어요ㅠ");
        }
    }

}
