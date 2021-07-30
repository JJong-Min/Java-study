import java.util.Scanner;

public class Gugudan {

    public static void main(String[] args) {
        // 2단 (단순 계산 및 출력)
//        System.out.println("2단");
//        System.out.println(2*1);
//        System.out.println(2*2);
//        System.out.println(2*3);
//        System.out.println(2*4);
//        System.out.println(2*5);
//        System.out.println(2*6);
//        System.out.println(2*7);
//        System.out.println(2*8);
//        System.out.println(2*9);

        // 3단 (단순 계산 및 출력)
//        System.out.println("3단");
//        System.out.println(3*1);
//        System.out.println(3*2);
//        System.out.println(3*3);
//        System.out.println(3*4);
//        System.out.println(3*5);
//        System.out.println(3*6);
//        System.out.println(3*7);
//        System.out.println(3*8);
//        System.out.println(3*9);

        // 4단 (변수에 값 입력 후 변수를 출력)
//        System.out.println("4단");
//        int result = 4*1;
//        System.out.println(result);
//        result = 4*2;
//        System.out.println(result);
//        result = 4*3;
//        System.out.println(result);
//        result = 4*4;
//        System.out.println(result);
//        result = 4*5;
//        System.out.println(result);
//        result = 4*6;
//        System.out.println(result);
//        result = 4*7;
//        System.out.println(result);
//        result = 4*8;
//        System.out.println(result);
//        result = 4*9;
//        System.out.println(result);

        // 5단 (사용자에게 숫자를 입력받고 그 숫자에 해당하는 단을 계산하여 출력)
//        System.out.println("구구단 중 출력할 단은? : ");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        System.out.println(num+"단");
//        System.out.println(num*1);
//        System.out.println(num*2);
//        System.out.println(num*3);
//        System.out.println(num*4);
//        System.out.println(num*5);
//        System.out.println(num*6);
//        System.out.println(num*7);
//        System.out.println(num*8);
//        System.out.println(num*9);

        // 6단 (반복문 while을 활용)
//        int i = 1;
//        while (i<10) {
//            System.out.println(6*i);
//            i++;
//        }

        // 7단 (반복문 for문을 활용)
//        for(int j = 1; j<10; j++) {
//            System.out.println(7*j);
//        }

        // 8단, 9단 (사용자에게 입력을 받은 후 조건문을 사용)
        System.out.println("구구단 중 출력할 단은? :");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (2<=num && num<=9) {
            System.out.println(num+"단");
            for (int i = 1; i<10; i++) {
                System.out.println(num*i);
            }
        } else {
            System.out.println("2이상 9이하의 숫자를 입력해주세요.");
        }



    }
}
