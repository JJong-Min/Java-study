package item1;

public class Foo2 {
    public static void doSomething() {
        // TODO 기상
        // TODO 운동
        // TODO 샤워
        // TODO 공부
        breakAndSleep();

    }
    public void doSomethingTomorrow() {
        // TODO 기상
        // TODO 달리기
        // TODO 샤워
        // TODO 친구만나기
        breakAndSleep();
    }
    // private method를 사용하는 이유
    // 이 메소드를 선언한 클래스 이외에 다른 클래스에서 이 메소드를 접근하게 하지 못하도록 하기 위해
    // 즉, 굳이 밖에 노출시키지 않아도 되는 메소드일 때 private 사용

    //private static method를 사용하는 이유
    // static method는 static한 필드나 메소드만 사용할 수 있으므로 위에서 선언한 doSomething() 메소드 처럼
    // static으로 선언된 method에서 breakAndSleep()이라는 private한 메소드를 사용하기 위해 private static으로 선언언
   private static void breakAndSleep() {
        // TODO 휴식
        // TODO 잠자기
    }

}
