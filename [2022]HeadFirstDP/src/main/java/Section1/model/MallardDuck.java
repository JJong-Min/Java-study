package Section1.model;

import Section1.Behavior.FlyWithWings;
import Section1.Behavior.Quack;
import Section1.model.Duck;

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
