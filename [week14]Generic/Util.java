public class Util {
    public static <T> GenericBox<T> boxing(T t) {
        GenericBox<T> box = new GenericBox<>();
        box.set(t);
        return box;
    }
}
