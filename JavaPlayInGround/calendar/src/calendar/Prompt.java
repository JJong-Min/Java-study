package calendar;

import java.util.Scanner;
import java.util.Arrays;

public class Prompt {

    private final static String PROMPT = "cal> ";

    public void runPrompt() {
        Calendar calendar = new Calendar();
        Scanner scanner = new Scanner(System.in);

        int month;
        int year;

        while(true) {
            System.out.println("년도을 입력하세요");
            System.out.print("Year> ");
            year = scanner.nextInt();

            System.out.println("달을 입력하세요");
            System.out.print("Month> ");
            month = scanner.nextInt();
            if (year < 1970 || month < 1) {
                break;
            }
            if (month > 12) {
                continue;
            }

            calendar.printCalendar(year, month);

        }

        System.out.print("Bye!!");
        scanner.close();
    }

    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
