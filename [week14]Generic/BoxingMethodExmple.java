public class BoxingMethodExmple {
    public static void main(String[] args) {
        GenericBox<Integer> box1 = Util.<Integer>boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        GenericBox<String> box2 = Util.boxing("Ratel");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}
