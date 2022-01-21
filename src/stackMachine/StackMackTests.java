package stackMachine;

public class StackMackTests {
	
	
	
	// f() = 5x^2 - 3
	public static void test0(Double x) {
		// create an empty program
		Program p = new Program();
		// add commands to p:
		p.add(new Push(3.0));
		p.add(new Push(x));
		p.add(new Push(x));
		p.add(new Push(5.0));
		p.add(new Mul());
		p.add(new Mul());
		p.add(new Sub());
		// now execute
		StackMachine.execute(p);
		
	}

	
	// f(x) = x^3 + 3x^2 - 2x + 1
	 public static void test1(Double x) {
			Program p = new Program();
			p.add(new Push(1));
			p.add(new Push(2));
			p.add(new Push(x));
			p.add(new Mul());
			//  1, 2x
			p.add(new Push(3));
			p.add(new Push(x));
			p.add(new Push(x));
			p.add(new Mul());
			p.add(new Mul());
			// 1 , 2x , 3x^2
			p.add(new Sub());
			// 1 , 3x^2 - 2x 
			p.add(new Push(x));
			p.add(new Push(x));
			p.add(new Push(x));
			p.add(new Mul());
			p.add(new Mul());
			// 1 , 3x^2 - 2x , x^3
			p.add(new Add());
			// 1 , x^3 + (3x^2 - 2x)
			p.add(new Add());
			// x^3 + (3x^2 - 2x) + 1
			
			// now execute
			StackMachine.execute(p);
			
	} 

	 public static void error0(Double x) //throws StackIsEmpty
	 {
		 Program p = new Program();
		 p.add(new Push(x));
		 p.add(new Add());
		 
		 
		 StackMachine.execute(p);
	 }

	 public static void error1(Double x) //throws StackIsEmpty
	 {
		 Program p = new Program();
		 p.add(new Sub());
		 StackMachine.execute(p);
	 }
	 
	 public static void error2(Double x) //throws StackIsEmpty
	 {
		 Program p = new Program();
		 p.add(new Push(x));
		 p.add(new Push(2));
		 p.add(new Div());
		 StackMachine.execute(p);
	 }
	public static void main(String[] args) {
		test1(2.0); // [17.0]
		test1(5.0); // [191.0]

		test0(2.0); // [17.0]
		test0(4.0); // [77]           
		
		error0(6.0); 
		error1(1.0);
		error2(10.0);
		
	}
	
	

}