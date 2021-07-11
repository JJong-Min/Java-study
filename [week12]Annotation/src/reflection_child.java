import java.util.Arrays;

public class reflection_child {

    public static void main(String[] args) {

        Arrays.stream(Child.class.getAnnotations()).forEach(System.out::println);
    }
}