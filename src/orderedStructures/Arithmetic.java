package orderedStructures;

public class Arithmetic extends Progression{
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	public double nextValue() {
		current = current + commonDifference; 
		return current;
	}

	public String toString() {
		return "Arith("+firstValue()+", "+commonDifference+")";
	}
	
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
		return (this.firstValue()+commonDifference*(n-1)); 
	}

	public Progression addTo(Arithmetic p2) {
		double newFirst = this.firstValue() + p2.firstValue();
		double newDiff = this.commonDifference + p2.commonDifference;
		Progression newP = new Arithmetic(newFirst, newDiff);
		return newP;
	}

	public Progression substractFrom(Arithmetic p2) {
		double newFirst = this.firstValue() - p2.firstValue();
		double newDiff = this.commonDifference - p2.commonDifference;
		Progression newP = new Arithmetic(newFirst, newDiff);
		return newP;
	}
}
