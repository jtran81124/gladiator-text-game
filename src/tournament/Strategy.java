package tournament;


public abstract class Strategy {
		
	public Strategy() {} 
	// not needed, but to understand that subclasses need this
	
	abstract void strike(Gladiator victim);
	
	abstract void setOwner(Gladiator owner);
	
}
