

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Die Klasse zum Starten der Anwendung
 * @author Marc Heimann
 */
public class Starter {

	public static void main(String[] args) {
		// Initialisierung von Spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/META-INF/spring/context-app.xml");
		
		// Aufruf verwenden
		Runnable service = ctx.getBean("application", Runnable.class);
		service.run();
	}
	
}
