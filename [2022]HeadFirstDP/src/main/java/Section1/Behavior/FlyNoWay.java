package Section1.Behavior;

import Section1.Behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("can't fly");
  }
}
