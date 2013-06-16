package org.karpukhin.patterns.chapter1;

/**
 * @author Pavel Karpukhin
 * @since 10.03.13
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
