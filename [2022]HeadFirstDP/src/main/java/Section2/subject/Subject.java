package Section2.subject;

public interface Subject {
  void registerObserver();
  void removeObserver();
  void notifyObservers();
}
