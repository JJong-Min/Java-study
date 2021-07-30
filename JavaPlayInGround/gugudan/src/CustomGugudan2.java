import java.util.Scanner;

public class CustomGugudan2 {
    public static void calculate(int num1, int num2) {
        for(int i=2; i<=num1; i++) {
            System.out.println(i+"단");
            for(int j=1; j<=num2; j++) {
                System.out.println(i*j);
            }
            System.out.println("----------");
        }
    }

    public static void main(String[] args) {
        System.out.println("보고싶은 단의 크기를 입력해주세요: ");
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String[] splitValue = inputValue.split(",");
        int num1 = Integer.parseInt(splitValue[0]);
        int num2 = Integer.parseInt(splitValue[1]);
        calculate(num1, num2);

    }
}

