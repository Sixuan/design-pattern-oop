public abstract class Component {
  public abstract void operation();
}

public class ComponentA extends Component {
  public void operation() {
    //operation on Object ComponentA
    System.out.println("ComponentA: operation");
  }  
}

public class ComponentB extends Component {
  public void operation() {
    //operation on Object ComponentB
    System.out.println("ComponentB: operation");
  }  
}
