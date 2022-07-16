package Section2.subject;

import Section2.observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

  private List<Observer> observers;
  private float temperature;
  private float pressure;
  private float humidity;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update());
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getPressure() {
    return pressure;
  }

  public float getHumidity() {
    return humidity;
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}
