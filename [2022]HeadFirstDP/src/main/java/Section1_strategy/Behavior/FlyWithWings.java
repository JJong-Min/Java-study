package Section1_strategy.Behavior;

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("fly with wings");
  }
}
