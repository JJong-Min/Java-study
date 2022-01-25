import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {              // socre가 90점보다 같거나 크면 A학점
            grade = 'A';
        } else if (score >= 80) {       // score가 80점보다 같거나 크면 B학점
            grade = 'B';
        } else if (score >= 70) {       // score가 70점보다 같거나 크면 C학점
            grade = 'C';
        } else {                        // 나머지는 D학점
            grade = 'D';
        }
        System.out.println("당신의 학점은 "+ grade + "입니다.");
    }
}
