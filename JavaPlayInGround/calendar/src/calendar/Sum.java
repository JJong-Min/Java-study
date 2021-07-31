package calendar;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        System.out.println("두 수를 입력해 주세요.");
        // scanner.next()의 반환타입은 string이다.
        s1 = scanner.next();
        s2 = scanner.next();
        System.out.println(s1 + ", " + s2);
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);

        int c = a + b;
        System.out.println("두 수의 합은 " + c + "입니다.");
        System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a+b);
        // 반드시 close해주어야 한다.
        scanner.close();
    }

}

