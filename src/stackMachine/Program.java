package stackMachine;

import java.util.ArrayList;
import java.util.List;

public class Program {
	List<Command> commands;
	
	public Program()
	{
		commands = new ArrayList<Command>();
	}
	public void execute() throws StackMachineException{
		for(Command cmmd: commands)
		{
			cmmd.execute(); //execute's each individual command
		}
		System.out.println(StackMachine.theStack.toString());
		StackMachine.theStack.clear();
	}
	
	public void add(Command x)
	{
		commands.add(x);
	}

}
