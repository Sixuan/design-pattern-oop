public abstract class Decorator extends Component {
  Component component;
  //attach new behavior to Decorator w/o changing base Component
  public abstract void operationNew();
}

public class DecoratorA extends Decorator {
 
    public void operation()
    {
      //operation on Object ComponentA
    }
 
    private void operationNew()
    {
      //NEW operation on Object DecoratorA
    }
}
