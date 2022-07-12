package DataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>(Arrays.asList("H","E","L","L"));
//      Set은 중복을 허용하지 않는다. /
//      순서가 없다.
        System.out.println(set1);

    }
}
