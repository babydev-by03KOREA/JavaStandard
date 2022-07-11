package DataType;

public class SBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello ");
        sb.insert(6, "Fucking");
        sb.append(" JavaServerPage!");
        String result = sb.toString();
        System.out.println(result);
    }
}
