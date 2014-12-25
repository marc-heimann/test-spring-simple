package de.heimann.services.calculator.standard;

import static org.springframework.util.Assert.notNull;

import de.heimann.services.calculator.Calculator;

public class SimpleCalculator implements Calculator {

	/**
	 * {@inheritDoc}
	 * @see Calculator#add(double...)
	 */
	@Override
	public double add(double... summands) {
		notNull(summands, "Summands may not be null");
		
		double retval = 0.0D;
		
		for (double val : summands) {
			retval += val;
		}
		
		return retval;
	}

	/**
	 * {@inheritDoc}
	 * @see Calculator#add(int...)
	 */
	@Override
	public int add(int... summands) {
		notNull(summands, "Summands may not be null");
		
		int retval = 0;
		
		for(int val : summands) {
			
			retval += val;
			
		}
				
		return retval;
	}

}
