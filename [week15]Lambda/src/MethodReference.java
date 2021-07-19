package javalambda;

import java.util.Arrays;
import java.util.Comparator;

public class MethodReference {

    public static void main(String[] args) {
        String[] names = {"Ratel", "Whiteshop", "jojoldu"};
        // 람다를 사용하지 않은 것
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        // 람다를 사용한 것
        Arrays.sort(names, (o1, o2) -> o1.compareTo(o2));

        // methodreference를 사용한 것
        // String::compareToIgnoreCase);
        Arrays.sort(names, String::compareToIgnoreCase);
    }
}
