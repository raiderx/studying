package org.karpukhin.elance.problem5;

/**
 Write a program which will accept a single pair of strings separated by a comma; the program should calculate the sum of ascii values of the characters of each string. The program should then subtract the sum of the ascii values of the second string from the sum of the ascii values of the first string.

 Suppose the following input is given to the program: 

 123ABC,456DEF

 Then the sum of the ascii values of the characters in '123ABC' is 348 and in '456DEF' it is 366. The Difference between these numbers is 348 – 366 = -18 
 The corresponding output to be printed by the program is: 

 -18
 IMPORTANT NOTES - READ CAREFULLY:

 1. Your solution should assume console input

 2. Your solution should contain class name as Main, as the solution will be compiled as Main.java 
 */

import java.util.Scanner;

/**
 * @author Pavel Karpukhin
 * @since 16.06.13
 */
public class Main {

    public static int f(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); ++i)
            c += s.charAt(i);
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ss = scanner.nextLine().split(",");
        int res = f(ss[0]) - f(ss[1]);
        System.out.println(res);
    }
}
