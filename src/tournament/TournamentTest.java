package tournament;

public class TournamentTest {

	public static void main(String[] args) {

		Gladiator sonya = new Gladiator("Sonya");
		Gladiator zena = new Gladiator("Zena");

		CompositeStrategy s1 = new CompositeStrategy();
		s1.add(new StabStrategy());
		s1.add(new StabStrategy());
		s1.add(new PoisonStrategy());
		sonya.setStrategy(s1);

		CompositeStrategy s2 = new CompositeStrategy();
		s2.add(new ShootStrategy());
		s2.add(new StabStrategy());
		s2.add(new PoisonStrategy());
		zena.setStrategy(s2);

		while(0 < zena.getHealth() && 0 < sonya.getHealth()) {
			System.out.println("Zena HP: " + zena.getHealth() );
			System.out.println("Sonya HP: " + sonya.getHealth() );
			sonya.attack(zena);
			zena.attack(sonya);
		}

		System.out.println("Results: ");
		System.out.println("   " + sonya);
		System.out.println("   " + zena);

	}

}