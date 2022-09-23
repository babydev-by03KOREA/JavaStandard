package Gukbe.ObjectCollabration;

public class Bus {

    int busNum;
    int passengerCount;
    int payMoney;

    public Bus(int busNum) {
        this.busNum = busNum;
    }

    public void take(int payMoney) {
        this.payMoney += payMoney;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(busNum + " 번의 승객 수는 " + passengerCount + " 이고, 총 매출은 " + payMoney + "₩ 입니다.");
    }

}
