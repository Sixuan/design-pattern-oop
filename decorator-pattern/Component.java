// Interface named Component 
public interface Component {
    // Method inside interface
    void operation();
}

public abstract class AbstractComponent implements Component {
  public void operation();
}

public class ComponentA extends AbstractComponent implements Component {
  public void operation() {
    //operation on Object ComponentA
  }  
}

public class ComponentB extends AbstractComponent implements Component {
  public void performAction(SubjectData d) {
    //operation on Object ComponentB
  }  
}
