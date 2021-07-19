package javastatic;

public class StaticMethodExample {
    static int count = 0;
    StaticMethodExample() {
        this.count++;
    }

    public static int getCount() {
        // 인스턴스 변수는 사용 불가
        // count가 static 변수여서 사용 가능한 것임
        return count;
    }

    public static void main(String[] args) {
        StaticMethodExample c1 = new StaticMethodExample();
        StaticMethodExample c2 = new StaticMethodExample();

        //static 메소드는 클래스로 접근 가능
        System.out.println(StaticMethodExample.getCount());
    }
}
