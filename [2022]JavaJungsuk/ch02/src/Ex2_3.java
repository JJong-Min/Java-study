public class Ex2_3 {
    public static void main(String[] args) {
        int score = 100;
        final int constScore = 300; //final은 상수(constant)를 의미
        System.out.println(score);
        System.out.println(constScore);

        score = 200;
        System.out.println(score);

        int oct = 010; // 8진수, 10진수로는 8
        int hex = 0x10; // 16진수, 10진수로는 16
        System.out.println(oct); // println은 10진수로출력되고 접두사, 접미사는 생략
        System.out.println(3.14f);
        System.out.println(1e3);
    }
}
