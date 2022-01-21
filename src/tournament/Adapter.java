package tournament;

public class Adapter extends Strategy {
	
	private Gladiator owner;
	
	private SpitFire adaptee = new SpitFire();
	
	public Adapter() {}
	
	public Adapter(Gladiator owner)
	{
		this.owner = owner;
	}
	
	public void strike(Gladiator other)
	{
		if (other.getHealth() > 0 && owner.getHealth() > 0 )
		{
			adaptee.fight(owner, other);
		}
	}
	
	public void setOwner(Gladiator owner)
	{
		this.owner = owner;
	}
}
