package stackMachine;

public class Div extends Command {
	
	public void execute() throws StackMachineException
	{

		double a = StackMachine.theStack.pop();
		
		if (StackMachine.theStack.getSize() <1 )
		{
			throw new StackTooShort("Stack is too short");
		}
		
		double b = StackMachine.theStack.pop();
		//can't divide by zero
		
		if (a == 0)
		{
			StackMachine.theStack.push(a);
			throw new DivByZero("Can not divide by zero");
		}
		double c = b/a;
		StackMachine.theStack.push(c);
		
	}
}

