package Gukbe.ObjectCollabration;

public class Transportation {
    public static void main(String[] args) {

        Collabration user1 = new Collabration("박예담", 1000);
        Collabration user2 = new Collabration("박형주", 1500);

        Bus bus101 = new Bus(101);
        Bus bus1017 = new Bus(1017);

        user1.takeBus(bus101);

        Subway LineNumber6 = new Subway(6);
        user2.takeSubway(LineNumber6);

        user1.userInfo();
        user2.userInfo();

        bus101.showBusInfo();
        LineNumber6.showSubwayInfo();
        bus1017.showBusInfo();

    }
}
