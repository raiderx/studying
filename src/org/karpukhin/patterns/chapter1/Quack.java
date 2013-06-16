package org.karpukhin.patterns.chapter1;

/**
 * @author Pavel Karpukhin
 * @since 10.03.13
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
