package Section1_strategy.model;

import Section1_strategy.Behavior.FlyNoWay;
import Section1_strategy.Behavior.Quack;

public class ModelDuck extends Duck{

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm model duck");
  }
}
