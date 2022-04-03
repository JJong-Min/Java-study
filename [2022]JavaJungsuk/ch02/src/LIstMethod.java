import java.util.List;

public class LIstMethod {

  public static void main(String[] args) {
    List list = List.of("poj", "ipj");
    System.out.println(list.isEmpty());
    System.out.println(list.size());
    List list2 = List.of();
    list.forEach(str -> {
      System.out.println(str);
      if (list2.isEmpty()) {
        list2.add("dd");
      }
    });
  }

}
