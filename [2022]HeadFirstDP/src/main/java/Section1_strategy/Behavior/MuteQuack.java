package Section1_strategy.Behavior;

public class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("can't quack");
  }
}
