package Section2.observer;

import Section2.display.DisplayElement;
import Section2.subject.WeatherData;
import java.net.http.WebSocketHandshakeException;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private float temperature;
  private float humidity;
  private WeatherData weatherData;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    display();
  }

  @Override
  public void display() {
    System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " +  humidity + "%");
  }
}
