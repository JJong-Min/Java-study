package calendar;

import java.util.Scanner;

public class MaxDaysOfMonth {
    public static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};

    public int getMaxDayOfMonth(int month) {
        return MAX_DAYS[month - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("달을 입력하세요.");
        int month;
        month = scanner.nextInt();
//
//        int [] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
//        System.out.printf("%d월의 최대 일수는 %d입니다.", month, maxDays[month - 1]);
//        scanner.close();

        MaxDaysOfMonth maxDaysOfMonth = new MaxDaysOfMonth();
        int maxDay = maxDaysOfMonth.getMaxDayOfMonth(month);
        System.out.printf("%d월의 최대 일수는 %d입니다.", month, maxDay);

    }
}
