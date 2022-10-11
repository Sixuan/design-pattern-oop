// DecoratorPatternDemo.java

// Class
// Main class
public class DecoratorPatternDemo {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an object of ComponentA and ComponentB
		ComponentA comA = new ComponentA();
    ComponentB comB = new ComponentB();

    comA.operation(); // ComponentA: operation
    comB.operation(); // ComponentB: operation
    
    
    // Creating an object of DecoratorA
    DecoratorA decorA = new Decorator(new ComponentA());
    decorA.operation(); // DecoratorA: operation
    decorA.operationNew(); // DecoratorA: NEW operation

	}
}
