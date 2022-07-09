package Section1.model;

import Section1.Behavior.FlyNoWay;
import Section1.Behavior.Quack;

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
