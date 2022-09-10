public interface Observer {
  //method called when subject notify observer a state change
  public void performAction(SubjectData d);
}

public class ObserverClassA {
  public void performAction(SubjectData d) {
    //do something with the data
  }
  
  //other methods in ObserverClassA
}

public class ObserverClassB {
  public void performAction(SubjectData d) {
    //do something with the data
  }
  
  //other methods in ObserverClassB
}

public class ObserverClassC {
  public void performAction(SubjectData d) {
    //do something with the data
  }
  
  //other methods in ObserverClassC
}
