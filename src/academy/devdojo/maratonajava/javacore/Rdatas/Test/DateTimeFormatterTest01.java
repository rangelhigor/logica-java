package academy.devdojo.maratonajava.javacore.Rdatas.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.time.format.DateTimeFormatter.BASIC_ISO_DATE;


public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(BASIC_ISO_DATE);
        String s2 = date.format(BASIC_ISO_DATE);
        String s3 = date.format(BASIC_ISO_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2021-02-19+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2021-02-19T18:46:04.1121294", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("19/02/2021", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("10.April.2024", formatterGR);
        System.out.println(parseGR);

        DateTimeFormatter formatterFR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRENCH);
        String formatFR = LocalDate.now().format(formatterFR);
        System.out.println(formatFR);
        LocalDate parseFR = LocalDate.parse("10.avril.2024", formatterFR);
        System.out.println(parseFR);

        DateTimeFormatter formatterJP = DateTimeFormatter.ofPattern("MM.dd.yyyy", Locale.JAPANESE);
        String formatJP = LocalDate.now().format(formatterJP);
        System.out.println(formatJP);
        LocalDate parseJP = LocalDate.parse("04.10.2024", formatterJP);
        System.out.println(parseJP);

    }
}
