package Section2_observer;

import Section2_observer.observer.CurrentConditionsDisplay;
import Section2_observer.subject.WeatherData;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
  }
}
