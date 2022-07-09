package Section1.Behavior;

import Section1.Behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("can't quack");
  }
}
