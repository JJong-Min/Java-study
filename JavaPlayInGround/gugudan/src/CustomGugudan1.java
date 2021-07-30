import java.util.Scanner;

public class CustomGugudan1 {
    public static void calculate(int num) {
        for(int i=2; i<=num; i++) {
            System.out.println(i+"단");
            for (int j = 1; j <= num; j++) {
                System.out.println(i*j);
            }
            System.out.println("---------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        calculate(num);
    }
}
