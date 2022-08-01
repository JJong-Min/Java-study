package Section1_strategy.Behavior;

public class FlyRocketPowered implements FlyBehavior{

  @Override
  public void fly() {
    System.out.println("fly with power of rocket");
  }
}
