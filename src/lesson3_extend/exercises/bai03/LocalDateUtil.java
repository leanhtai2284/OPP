package lesson3_extend.exercises.bai03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {
    private static final DateTimeFormatter DDMMYYYY = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter YYYYMMDD = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    private LocalDateUtil() {}

    public static LocalDate fromString_ddMMyyyy(String date){ return LocalDate.parse(date, DDMMYYYY);}
    public static LocalDate fromString_yyyyMMdd(String date){ return LocalDate.parse(date, YYYYMMDD);}
    public static String toString_ddMMyyyy(LocalDate date){ return date.format(DDMMYYYY);}
    public static String toString_yyyyMMdd(LocalDate date){ return date.format(YYYYMMDD);}
}
