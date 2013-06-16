package org.karpukhin.elance.problem3;

import java.util.Scanner;

/**
 * @author Pavel Karpukhin
 * @since 16.06.13
 */
public class Main {

    public static String f(int h) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= h; ++i) {
            for (int j = 0; j < h-i; ++j)
                sb.append(' ');
            for (int j = 0; j < i; ++j) {
                sb.append(i);
                if (j < i-1)
                    sb.append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            System.out.print(f(t));
        }
        scanner.close();
    }
}
