package tournament;

import java.util.ArrayList;

public class CompositeStrategy extends Strategy {
	
	Gladiator owner; 
	ArrayList<Strategy> strats;
	
	public CompositeStrategy()
	{
		strats = new ArrayList<Strategy>();
	}
	
	public void add(Strategy x)
	{
	
		strats.add(x);
	}
	
	public void strike(Gladiator other)
	{
		//goes through list of strats and does them
		for(Strategy x: strats)
		{
			
			x.strike(other);
		}
	}
	
	public void setOwner(Gladiator owner)
	{
		for (Strategy setMe: strats)
		{		
			setMe.setOwner(owner);
		}
	}
}