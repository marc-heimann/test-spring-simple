package de.heimann.services.calculator;

/* Ein einfacher Taschenrechner
 * @author Marc Heimann
 **/
public interface Calculator {
	
	/**
	 * Addiere rationale Zahlen
	 * @param summands die Summanden
	 * @return die Summe
	 */
	double add(double ... summands);
	
	/**
	 * Addiere die natürlichen Zahlen
	 * @param summands die Summanden
	 * @return die Summe
	 */
	int add(int ... summands);
	
}
