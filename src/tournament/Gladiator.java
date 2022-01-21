package tournament;

public class Gladiator {
	
	String name;
	int health;
	Strategy strat;
	
	public Gladiator(String name)
	{
		this.name = name;
		this.health = 100;
	}
	
	public void attack(Gladiator other)
	{
		this.strat.strike(other);
	}
	
	public String getName() {return name;}
	
	public int getHealth() {return health;}
	
	public void setStrategy(Strategy strat) //questions on this
	{
		this.strat = strat;
		strat.setOwner(this); // the owner of this class 
	}

	public void decHealth(int damage)
	{

		if (health > 100) { health = 100;}
		health = health - damage;
		
		if (health <=0) {
			health = 0;
			System.out.println(name + " is dead"); }
	}
	
	public String toString()
	{
		return name + " " + health;
	}
	
	
	
	
}
