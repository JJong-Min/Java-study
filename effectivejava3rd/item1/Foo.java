package item1;

public class Foo {
    String name;
    String address;

    private static final Foo GOOD_NIGHT = new Foo();
    public Foo() {
    }
    public Foo(String name) {
        this.name = name;
    }
    // 같은 시그니처를 가진 생성자는 만들 수 없다.
    /*public Foo(String address) {
        this.address = address;
    } */
    public static Foo withName(String name) {
        return new Foo(name);
    }
    // public static Factory method를 사용하면 가능
    public static Foo withAddress(String address) {
        Foo foo = new Foo();
        foo.address = address;
        return foo;
    }
    public static Foo getFoo() {
        return GOOD_NIGHT;
    }

    public static void main(String[] args) {
        Foo foo1 = new Foo("ratel");
        // 이름을 가지고 있어 생성자를 객체를 생성하는 것보다 매개값이 무엇을 의미하는지 알기 편함.
        Foo foo2 = Foo.withName("ratel");
        // 이렇게 하면 매번 새로운 객체가 생성하는 것이 아닌 이미 만들어진 객체를 담고 있는 상수를 호출하게 됨.
        Foo foo3 = Foo.getFoo();
    }
}
