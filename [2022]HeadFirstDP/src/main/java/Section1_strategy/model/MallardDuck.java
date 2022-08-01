package Section1_strategy.model;

import Section1_strategy.Behavior.FlyWithWings;
import Section1_strategy.Behavior.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm water Duck");
  }
}
