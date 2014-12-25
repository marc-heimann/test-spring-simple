package de.heimann.services.calculator.standard;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SimpleCalculatorTest {

	@Autowired
	private SimpleCalculator calculator;
	
	/**
	 * Test method for {@link SimpleCalculator#add(double[])}.
	 */
	@Test
	public void testAddDoubleArray() {
		double result = calculator.add(1.0, 2.0);
		assertThat("Test der Addition", result, is(3.0D));
	}
	
	/**
	 * Test method for {@link SimpleCalculator#add(int[])}.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testAddIntArray() {
		calculator.add((int[]) null);
	}
	
}
