package tournament;

public class PoisonStrategy extends Strategy{
	
	private Gladiator owner;
	
	public PoisonStrategy() {}
	
	public PoisonStrategy(Gladiator owner)
	{
		this.owner = owner;
	}
	
	public void strike(Gladiator other)
	{
		if (owner.getHealth() > 0 && other.getHealth() >0)
		{
		System.out.println ( owner.getName() +" poison " + other.getName() );
		other.decHealth(Utilities.nextInt( owner.getHealth() /2));
		}
	}
	public void setOwner(Gladiator owner) {this.owner = owner;}
}
