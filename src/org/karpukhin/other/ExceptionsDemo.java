package org.karpukhin.other;

/**
 * @author Pavel Karpukhin
 * @since 27.02.13
 */
public class ExceptionsDemo {

    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("x");
        } catch (RuntimeException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }
    }
}
