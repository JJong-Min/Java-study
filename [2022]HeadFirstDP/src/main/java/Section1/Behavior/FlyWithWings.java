package Section1.Behavior;

import Section1.Behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("fly with wings");
  }
}
