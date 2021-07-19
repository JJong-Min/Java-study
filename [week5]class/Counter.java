package javastatic;

public class Counter  {
    // int count = 0;
    static int count = 0;
    Counter() {
        this.count++;
        System.out.println(this.count);
    }

    public static void main(String[] args) {
        // static이 없으면 객체마다 count필드가 메모리에 생겨 c1과 c2 출력값이 1,1
        // static을 넣어주면 하나의 메모리 공간만 생겨 c1, c2 출력값이 1, 2
        Counter c1 = new Counter();
        Counter c2 = new Counter();
    }
}