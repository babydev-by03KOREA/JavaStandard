package Gukbe.ObjectCollabration;

public class Collabration {
    String userName;
    int userMoney;

    public Collabration(String userName, int userMoney) {
        this.userName = userName;
        this.userMoney = userMoney;
    }

    public void takeBus(Bus bus) {
        bus.take(720);
        this.userMoney -= 720;
    }

    public void takeSubway(Subway subway) {
        subway.take(1250);
        this.userMoney -= 1250;
    }

    public void userInfo() {
        System.out.println(userName + "님의 잔액은 " + userMoney + "₩ 입니다.");
    }
}
