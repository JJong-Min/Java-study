package Section1.Behavior;

import Section1.Behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("squeak squeak");
  }
}
