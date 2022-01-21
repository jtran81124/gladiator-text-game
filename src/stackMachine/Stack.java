package stackMachine;
import java.util.ArrayList;

public class Stack<T>
{
	private ArrayList<T> elems = new ArrayList<T>();
	private int top = 0;
	
	public int getSize()
	{
		return top;
	}
	// empty constructor initialized
	//push pop, topo clear
	
	public T top() throws StackIsEmpty
	{
		if(elems.size() == 0)
		{
			throw new StackIsEmpty("Stack is Empty");
		}
		else
		{
			return elems.get(top-1);
		}
	}
	
	public void push(T element) {
		elems.add(top++ , element);
		// adds element after top
	}
	
	
	public T pop() throws StackIsEmpty
	{
		if(elems.size() == 0)
		{
			throw new StackIsEmpty("Stack is Empty");
		}
		else {return elems.remove(--top); }
		//pre decrement top. returns element before top before decrementing top of array
		
	}
	
	public void clear()
	{
		top = 0;
		elems.removeAll(elems);
	}
	
	public String toString()
	{
		/* String returnMe = "";
		for(T stuffs: elems)
		{
			returnMe += stuffs;
		}
		return returnMe;
		*/
		return elems.toString();
	}
	//tests generic stack
	
	/*
	public static void main (String[] args)
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(11);
		
		int a = s.top();
		int i = s.pop();	
		int j = s.pop();
		
		
		System.out.println(a);
		System.out.format("%4d%n",  i);
		System.out.format("%4d%n",  j);
		
	}
	*/
	
}
