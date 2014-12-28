package de.heimann.aop;

import static org.slf4j.LoggerFactory.getLogger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;

/**
 * Eine tracing Aspect.
 * @author Marc Heimann
 */
public class Trace {

	private static final Logger LOG = getLogger(Trace.class);
	
	/**
	 * Eine Methode (Advice) die vor der Zielmethode (Join Point) aufgerufen wird	 
	 */
	public void traceBEfore() {
		LOG.trace("TRACE-Logausgabe vor Aufruf der Methode");
	}
	
	/**
	 * Führe diese Methode (Advice) um die Zielmethode (Join Point) herum aus.
	 * @param joinPoint ein Object, welches den Join Point beschreibt und
	 * zusätzlich eine {@link ProceedingJoinPoint#proceed()}-Methode anbietet
	 * @return das gewünschte Ergebnis
	 * @throws Throable falls ein Fehler auftritt
	 */
	public Object debugAround(ProceedingJoinPoint joinPoint) throws Throwable {
		LOG.debug("DEBUG-Logausgabe vor Ausführung der Methode");
		
		Object result = null;
		try {
			result = joinPoint.proceed();
		} catch (Exception e) {
			LOG.error("ERROR-Logausgabe, weil während der Ausführung ein Fehler auftrat", e);
			throw e;
		}
	
		LOG.debug("DEBUG-Logausgabe nach der Ausführung der Methode mit ergebnis= {}", result);
		
		return result;
		
	}
	
	/**
	 * Eine Methode (Advice) die nach der Ausführung der Methode (Join Point) aufgerufen wird.
	 * @param result das Ergebnis der Zielmethode
	 */
	
	public void traceAfter(Object result) {
		LOG.trace("TRACE-Logausgabe nach Aufruf der Methode mit dem Ergebnis={}", result);
	}
	
}
