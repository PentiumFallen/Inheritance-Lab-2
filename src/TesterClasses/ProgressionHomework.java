package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Fibonacci;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionHomework {
	public static void main(String[] args) {
		Progression p1, p2, p3, p4, p5; 
				
		System.out.println("Testing Equals method:"); 
		p1 = new Fibonacci();
		p2 = new Geometric(2, 3);
		p3 = new Arithmetic(2, 3);
		p4 = new Geometric(2, 3);
		p5 = new Arithmetic(2, 4);
		System.out.println("p1="+p1.toString()+" p2="+p2.toString()+" p3="+p3.toString()+" p4="+p4.toString()+" p5="+p5.toString());
		System.out.println("Test 1 - Should be false; Is "+ p1.equals(p2));
		System.out.println("Test 2 - Should be false; Is "+ p2.equals(p3));
		System.out.println("Test 3 - Should be false; Is "+ p1.equals(p3));
		System.out.println("Test 4 - Should be  true; Is "+ p2.equals(p4));
		System.out.println("Test 5 - Should be false; Is "+ p3.equals(p5));
		
		System.out.println("\n\nTesting Combinable interface:");
		p1 = new Arithmetic(1, 1);
		p2 = new Arithmetic(0, 2);
		p3 = new Arithmetic(1, 2);
		p4 = new Arithmetic(2, 3);
		p5 = p1.addTo((Arithmetic) p2);
		p5.printAllTerms(5);
		p5 = p4.substractFrom((Arithmetic) p3);
		p5.printAllTerms(5);
	}
}