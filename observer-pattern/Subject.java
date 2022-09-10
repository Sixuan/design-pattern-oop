public interface Subject {
  
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();

}

public class SubjectData {
  private float dataA;
  private int dataB;
  private float dataC;
}

public class SubjectImpA implements Subject {
  private List<Observer> observers;
  private SubjectData data;
  
  public SubjectImpA() {
    observers = new ArrayList<Observer>();
  }
  
  public void registerObserver(Observer o) {
    observers.add(o);
  }
  
  public void removeObserver(Observer o) {
    observers.remove(o);
  }
  
  public void notifyObserver(Observer o) {
    for (Observer o : observers) {
        o.performAction(data)
    }
  }
  
  // other SubjectImpA methods here
}
