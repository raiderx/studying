package org.karpukhin.elance.problem3;

import java.util.Scanner;

/**
 * @author Pavel Karpukhin
 * @since 16.06.13
 */
public class Main {

    public static void f(int h) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= h; ++i) {
            for (int j = 0; j < h-i; ++j) sb.append(' ');
            for (int j = 0; j < i; ++j) {
                sb.append(i);
                if (j < i)
                    sb.append(' ');
            }
            if (i < h)
                sb.append('\n');
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h1 = s.nextInt();
        int h2 = s.nextInt();
        int h3 = s.nextInt();
        f(h1);
        f(h2);
        f(h3);
    }
}
