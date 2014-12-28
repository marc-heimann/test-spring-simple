package de.heimann.app;

import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.heimann.services.calculator.Calculator;

/**
 * Die Anwendung zum Aufrufen des Taschenrechners.
 * @author Marc Heimann
 **/
@Component
public class Application implements Runnable {

	private static final Logger LOG = getLogger(Application.class);
	
	@Autowired(required = true)
	private Calculator calculator;
	
	/**
	 * {@inheritDoc}
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// Aufruf des Taschenrechners
		double result = calculator.add(1.0, 2.0, 3);
		if (LOG.isInfoEnabled()) {
			LOG.info("run" + "Ergebnis 1 = {}", result);
		}
		
		result = calculator.add((double[]) null);
		if (LOG.isInfoEnabled()) {
			LOG.info("run" + "Ergebnis 2 = {}", result);
		}

	}

}
