package DataType;

// Table1 => Y/N    Table2 => 1/0, true/false

public class Enum_Bamin {
    public String toValue1(String originValue) {
        if("Y".equals(originValue)){
            return "Yes";
        }else {
            return "No";
        }
    }

    public Boolean toValue2(String originValue) {
        return "Y".equals(originValue);
    }

    public static void main(String[] args) {
        Enum_Bamin e = new Enum_Bamin();
        System.out.println(e.toValue1("Y"));
        System.out.println(e.toValue2("Y"));
    }
}
