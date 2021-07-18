public class NoneGenericBoxExmple {
    public static void main(String[] args) {
        NoneGenericBox box = new NoneGenericBox();
        box.set("Ratel"); // String을 Object로 자동 타입 변환
        String name = (String) box.get(); // Object를 String으로 강제 타입 변환

        box.set(new DummyClass()); // DummyClass을 Object로 자동 타입 변환
        DummyClass dc = (DummyClass) box.get(); // Object를 DummyClass으로 강제 타입 변환

    }
}
