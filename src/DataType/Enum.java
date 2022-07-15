package DataType;

enum m1 {m1, m1_Air, m1_Pro, m1_Max};

public class Enum {
    public static void main(String[] args) {
        m1[] arr = m1.values();
        for (m1 m : arr) {
            System.out.println(m);
        }
    }
}
