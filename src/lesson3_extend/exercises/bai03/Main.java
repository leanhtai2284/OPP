package lesson3_extend.exercises.bai03;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String s1 = "22/12/2025";
        LocalDate d1 = LocalDateUtil.fromString_ddMMyyyy(s1);
        System.out.println("dd/MM/yyyy: " + s1);
        System.out.println("LocalDate : " + d1);
        System.out.println();

        String str1 = LocalDateUtil.toString_ddMMyyyy(d1);
        System.out.println("toString_ddMMyyyy: " + str1);
        System.out.println();

        String s2 = "2025/12/22";
        LocalDate d2 = LocalDateUtil.fromString_yyyyMMdd(s2);
        System.out.println("yyyy/MM/dd: " + s2);
        System.out.println("LocalDate : " + d2);
        System.out.println();

        String str2 = LocalDateUtil.toString_yyyyMMdd(d2);
        System.out.println("toString_yyyyMMdd: " + str2);
        System.out.println();

    }
}
