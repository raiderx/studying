package org.karpukhin.elance.problem9;

/**
 * @author Pavel Karpukhin
 * @since 16.06.13
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 258; i <= 393; ++i) {
            if ((i + 5) % 10 > 0) {
                System.out.println(i);
            }
        }
    }
}
