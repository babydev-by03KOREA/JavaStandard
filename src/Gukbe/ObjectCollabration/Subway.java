package Gukbe.ObjectCollabration;

public class Subway {
    int lineNum;
    int passengerCount;
    int payMoney;

    public Subway(int lineNum) {
        this.lineNum = lineNum;
    }

    public void take(int payMoney) {
        this.payMoney += payMoney;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(lineNum + " 호선의 승객 수는 " + passengerCount + " 이고, 총 매출은 " + payMoney + "₩ 입니다.");
    }
}
