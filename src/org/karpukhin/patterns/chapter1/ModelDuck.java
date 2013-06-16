package org.karpukhin.patterns.chapter1;

/**
 * @author Pavel Karpukhin
 * @since 10.03.13
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
