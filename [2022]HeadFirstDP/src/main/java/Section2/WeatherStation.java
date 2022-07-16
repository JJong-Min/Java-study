package Section2;

import Section2.observer.CurrentConditionsDisplay;
import Section2.subject.WeatherData;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
  }
}
