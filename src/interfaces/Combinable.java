package interfaces;

import orderedStructures.Arithmetic;
import orderedStructures.Progression;

public interface Combinable {
	Progression addTo(Arithmetic p2);
	Progression substractFrom(Arithmetic p2);
}
