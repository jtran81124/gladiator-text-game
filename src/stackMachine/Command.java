package stackMachine;

public abstract class Command {
	
	abstract public void execute() throws StackMachineException; //needs to execute a subclass command
}
