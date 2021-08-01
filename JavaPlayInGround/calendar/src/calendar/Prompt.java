package calendar;

import java.util.Scanner;
import java.util.Arrays;

public class Prompt {

    private final static String PROMPT = "cal> ";
    private final static String [] WEEKDAY = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
    public int parseDay(String weekday) {
        return Arrays.asList(WEEKDAY).indexOf(weekday);
    }

    public void runPrompt() {
        Calendar calendar = new Calendar();
        Scanner scanner = new Scanner(System.in);

        int month;
        int year;
        int weekday;

        while(true) {
            System.out.println("년도을 입력하세요");
            System.out.print("Year> ");
            year = scanner.nextInt();

            System.out.println("달을 입력하세요");
            System.out.print("Month> ");
            month = scanner.nextInt();

            System.out.println("첫 째날의 요일을 입력하세요(SU, MO, TU, WE, TH, FR, SA)");
            System.out.print("Weekday> ");
            String inputStr = scanner.next();
            if (!(Arrays.stream(WEEKDAY).anyMatch(inputStr::equals))) {
                System.out.println("SU, MO, TU, WE, TH, FR, SA 중 하나를 입력해주세요.");
                System.out.print("Weekday> ");
                inputStr = scanner.next();
            }

            weekday = parseDay(inputStr);

            if (month == -1) {
                break;
            }
            if (month > 12) {
                continue;
            }

            calendar.printCalendar(year, month, weekday);

        }

        System.out.print("Bye!!");
        scanner.close();
    }

    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
