package calendar;

import java.util.Scanner;

public class Prompt {

    private  final static String PROMPT = "cal> ";

    public void runPrompt() {
        Calendar calendar = new Calendar();
        Scanner scanner = new Scanner(System.in);

        int month;

        while(true) {
            System.out.println("달을 입력하세요");
            System.out.print(PROMPT);
            month = scanner.nextInt();
            if (month == -1) {
                break;
            }
            if (month > 12) {
                continue;
            }

            calendar.printCalendar(2021, month);

        }

        System.out.print("Bye!!");
        scanner.close();
    }

    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
