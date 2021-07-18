public class GenericBoxExample {
    public static void main(String[] args) {
        GenericBox<String> box = new GenericBox<String>();
        box.set("hello");
        String str = box.get();
    }
}
