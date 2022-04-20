package numeropi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Esta es la clase Traza, encargada de crear las trazas en las demás clases
 * 
 * @author formacion14
 * @since 20/04/2022
 */

public class Traza {

	public static final String INFO = "i";
	public static final String DEBUG = "d";
	public static final String TRACE = "t";
	public static final String WARN = "w";
	public static final String ERROR = "e";

	private Logger logger;

	public Traza(Class cls) {
		this.logger = LoggerFactory.getLogger(cls);
	}

	public void escribe(String mensaje) {
		escribe(INFO, mensaje);
	}

	public void escribe(String nivel, String mensaje) {
		switch (nivel) {
		case INFO:
			logger.info("Mensaje " + mensaje);
			break;
		case DEBUG:
			logger.debug("Mensaje " + mensaje);
			break;
		case TRACE:
			logger.trace("Mensaje " + mensaje);
			break;
		case WARN:
			logger.warn("Mensaje " + mensaje);
			break;
		case ERROR:
			logger.error("Mensaje " + mensaje);
			break;
		default:
			logger.info("Mensaje " + mensaje);
			break;
		}
	}
}
