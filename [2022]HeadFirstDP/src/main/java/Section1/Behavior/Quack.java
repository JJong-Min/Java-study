package Section1.Behavior;

import Section1.Behavior.QuackBehavior;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("quack quack");
  }
}
