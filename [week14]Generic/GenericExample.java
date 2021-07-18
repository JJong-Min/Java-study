import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {
        //제네릭을 쓰지 않은 경우
        List list = new ArrayList();
        list.add("hello");
        // 요소를 가져올 시에 타입 변환을 해주어야함.
        String str = (String) list.get(0);
        System.out.println(str);

        //제네릭을 쓴 경우
        List<String> useGenericList = new ArrayList<String>();
        useGenericList.add("helloIntelliJ");
        //타입 변환없이 요초 가져오기 가능
        String listStr = useGenericList.get(0);
        System.out.println(listStr);
    }
}
