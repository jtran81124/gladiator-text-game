package stackMachine;

public class Pop extends Command{	
	
	public void execute() throws StackMachineException
	{
		
		StackMachine.theStack.pop();
	}
}
