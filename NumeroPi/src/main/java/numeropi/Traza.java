package numeropi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase encargada de crear las trazas
 * 
 * @author formacion14
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

	/**
	 * Método encargado de escribir las trazas del nivel info
	 */

	public void escribe(String mensaje) {
		escribe(INFO, mensaje);
	}

	/**
	 * Método encargado de escribir las trazas de los diferentes niveles log
	 */

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
