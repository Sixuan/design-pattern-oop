public abstract class AbstractDecorator extends AbstractComponent {
  public abstract void operationNew();
}

public class DecoratorA extends AbstractDecorator {
 
    public void operation()
    {
      //operation on Object ComponentA
    }
 
    private void operationNew()
    {
      //NEW operation on Object DecoratorA
    }
}
