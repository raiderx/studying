package org.karpukhin.elance.problem1;

import java.util.Scanner;

/**
 * @author Pavel Karpukhin
 * @since 16.06.13
 */
public class Main {

    public static final double U = 36 * 1000 / 3600;
    public static final double A = 5;

    public static int f(double t) {
        return (int)(U*t+((A*t*t)/2));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double t = scanner.nextDouble();
            System.out.println(f(t));
        }
        scanner.close();
    }
}
