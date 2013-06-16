package org.karpukhin.elance.problem4;

/**
 Write a program which will take the year (yyyy) and the numeric sequence of
 the month (0-11) as its input. The program will return the day on which
 the 28th of that particular month and year falls. The input can consist of
 two year-month combinations, one combination per line.

 The numeric sequence of months is as follows:

 0 – Jan
 1 – Feb
 2 – March
 and so on......

 The format for supplying the input is:

 1999-5

 Where 1999 is the year and 5 is the numeric sequence of the month
 (corresponding to June). The program should display the day on
 which June 28, 1999 fell, and in this case the output will be MONDAY.

 The output should be displayed in uppercase letters.

 Suppose the following INPUT sequence is given to the program:

 1999-5
 1998-6

 Then the output should be:

 MONDAY
 TUESDAY
 IMPORTANT NOTES - READ CAREFULLY:

 1. Your solution should assume console input

 2. Your solution should contain class name as Main, as the solution will be compiled as Main.java
 */
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Pavel Karpukhin
 * @since 16.06.13
 */
public class Main {

    public static void f(String h) {
        String[] ss = h.split("-");
        int y = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);
        Calendar c = Calendar.getInstance();
        c.set(y, m, 28);
        System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        f(s.nextLine());
        f(s.nextLine());
    }
}
