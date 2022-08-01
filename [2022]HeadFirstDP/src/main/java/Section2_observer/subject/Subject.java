package Section2_observer.subject;

import Section2_observer.observer.Observer;

public interface Subject {
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
}
