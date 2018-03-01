package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
        //TODO add the necessary code here
		double temp = current;
		current = current + prev;
		prev = temp;
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}

	public String toString() {
		return "Fibo";
	}
	@Override
	public Progression addTo(Arithmetic p2) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Progression substractFrom(Arithmetic p2) {
		// TODO Auto-generated method stub
		return null;
	}

}
