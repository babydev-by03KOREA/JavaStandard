package Interface;

interface Calculable {
    int add (int m1, int m2);
//  Client가 '필수적으로' 구현되길 원하는것
}

interface Printable{
    void print();
}

class realCalc implements Calculable,Printable {
//  함수의 오버라이드로 구현
    @Override
    public int add(int m1, int m2) {
        return m1 + m2;
    }

    @Override
    public void print() {
        System.out.println("출력할수있어요!");
    }
}

class dum {
    public int sum(int v1, int v2) {
        return v1 + v2;
    }
}

public class interf_calc {
    public static void main(String[] args) {
        realCalc real = new realCalc();
        System.out.println(real.add(3,4));
        real.print();
    }
}
