package stackMachine;

public class Mul extends Command{
	
	public void execute() throws StackMachineException
	{

		double a = StackMachine.theStack.pop();
		
		if (StackMachine.theStack.getSize() <1 )
		{
			throw new StackTooShort("Stack is too short");
		}
		double b = StackMachine.theStack.pop();
		double c = a*b;
		StackMachine.theStack.push(c);
		
	}
}
