package stackMachine;


public class StackMachine {
	public static Stack <Double> theStack = new Stack<Double>();

	// encounter errors: stack is empty, too short, divide by 0, and syntax error
	public static void execute(Program p)
	{
		// need to try and catch here
		try
		{
			p.execute();
		}
		catch(StackTooShort theMessage)
		{
			System.err.println(theMessage.getMessage());
		}
		catch(StackIsEmpty theMessage)
		{
			System.err.println(theMessage.getMessage());
		}		
		catch(DivByZero theMessage)
		{
			System.err.println(theMessage.getMessage());
		}
		catch(StackSyntaxError theMessage)
		{
			System.err.println(theMessage.getMessage());
		}
		catch(StackMachineException theMessage)
		{
			System.err.println(theMessage.getMessage());
		}
		
		
	}
}
