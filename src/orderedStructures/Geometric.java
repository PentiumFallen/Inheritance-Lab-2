package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		current = current * commonFactor; 
		return current;
	}

	public String toString() {
		return "Geom("+firstValue()+", "+commonFactor+")";
	}

	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
		return (this.firstValue()*(Math.pow(commonFactor, n-1))); 
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
