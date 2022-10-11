public abstract class Decorator extends Component {
  Component component;
  
  public Decorator(Component component)
  {
      this.component = component;
  }
  
  //attach new behavior to Decorator w/o changing base Component
  public abstract void operationNew();
}

public class DecoratorA extends Decorator {
 
    public void operation()
    {
      //operation on Object ComponentA
      System.out.println("DecoratorA: operation");
    }
 
    private void operationNew()
    {
      //NEW operation on Object DecoratorA
      System.out.println("DecoratorA: NEW operation");
    }
}
