import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class sdsd {
    public static void main(String[] args) {
        Month month = Month.valueOf("August".toUpperCase());
        System.out.printf("For the month of %s all SATURDAY are:%n", month);
        LocalDate localdate = Year.now().atMonth(month).atDay(1).
                with(TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY));
        Month mi = localdate.getMonth();
        while (mi == month) {
            System.out.printf("%s%n", localdate);
            localdate = localdate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
            mi = localdate.getMonth();
        }
    }
}
