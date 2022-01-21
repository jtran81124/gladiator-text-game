package stackMachine;

public class Push extends Command{
	
	private Double N;
	
	public Push(double N)
	{
		this.N = N;
	}
	
	public void execute() {
		StackMachine.theStack.push(N);
	}
}
