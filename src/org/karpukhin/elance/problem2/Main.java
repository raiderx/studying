package org.karpukhin.elance.problem2;

import java.util.Scanner;

/**
 * @author Pavel Karpukhin
 * @since 16.06.13
 */
public class Main {

    public static int f(int h) {
        int r = 0;
        int[] d = {20, 10, 5};
        for (int i = 0; i < h; ++i) {
            r += d[i%3];
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            int h = scanner.nextInt();
            System.out.println(f(h));
        }
        scanner.close();
    }
}
