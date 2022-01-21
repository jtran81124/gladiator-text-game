package tournament;

import java.util.Random;

public class Utilities {

	private static Random gen;
	
	public static int nextInt(int upperRange)
	{
	     gen = new Random();
	    return gen.nextInt(upperRange) + 1;
	}
	
}
