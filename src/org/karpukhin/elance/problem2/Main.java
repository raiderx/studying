package org.karpukhin.elance.problem2;

import java.util.Scanner;

/**
 * @author Pavel Karpukhin
 * @since 16.06.13
 */
public class Main {

    public static int f(int h) {
        int r = 0, j = 0;
        int[] d = {20, 10, 5};
        for (int i = 0; i < h; ++i) {
            r += d[j++];
            j = j % 3;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h1 = s.nextInt();
        int h2 = s.nextInt();
        int h3 = s.nextInt();
        int h4 = s.nextInt();
        System.out.println(f(h1));
        System.out.println(f(h2));
        System.out.println(f(h3));
        System.out.println(f(h4));
    }
}
