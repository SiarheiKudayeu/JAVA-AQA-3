package lesson7.c_formatter;

import java.time.LocalDate;
import java.util.Date;

public class DateFormatter {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //%t, %T

        //H - hours, M - minutes, S - seconds, L - milliseconds , N - nanoseconds.
        //p - add info about pm and am
        System.out.printf("Current date format is in %tH HOURS\n", date);
        System.out.printf("Current date format is in %tM MINUTES\n", date);
        System.out.printf("Current date format is in %tS SECONDS\n", date);

        System.out.printf("Current date is %1$tH:%1$tM:%1$tS \n", date);

        //A - day of week, d - two numbers of date , B - month, m - month in number format,
        // Y - year, y - two final year number

        System.out.printf("Current date is %1$tA %1$td %1$tB %1$tY \n", date);

        //get tomorrows date
        String todayDay = String.format("%td", date);
        int tomorrowDay = Integer.parseInt(todayDay) + 55;
        System.out.println("Next day will be the " + tomorrowDay);


        //LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Next day will be the " + localDate.plusDays(55).getDayOfMonth()
                + " " + localDate.plusDays(55).getMonth());

    }
}
