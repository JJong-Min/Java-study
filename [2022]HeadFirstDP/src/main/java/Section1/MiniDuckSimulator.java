package Section1;

import Section1.Behavior.FlyRocketPowered;
import Section1.model.Duck;
import Section1.model.MallardDuck;
import Section1.model.ModelDuck;

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
