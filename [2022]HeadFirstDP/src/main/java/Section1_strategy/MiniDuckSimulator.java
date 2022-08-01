package Section1_strategy;

import Section1_strategy.Behavior.FlyRocketPowered;
import Section1_strategy.model.Duck;
import Section1_strategy.model.MallardDuck;
import Section1_strategy.model.ModelDuck;

public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
