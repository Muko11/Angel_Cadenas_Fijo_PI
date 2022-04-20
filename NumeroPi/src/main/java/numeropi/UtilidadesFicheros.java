package numeropi;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Esta es la clase UtilidadesFicheros encargada de escribir en un fichero el
 * valor final de PI
 * 
 * @author formacion14
 * @since 20/04/2022
 */

public class UtilidadesFicheros {

	static Traza traza = new Traza(UtilidadesFicheros.class);

	public static void imprimirValorFinalPi(double valorPiObtenio) {

		String file = "logs/calculo.txt";
		try {

			FileWriter writer = new FileWriter(file);
			PrintWriter printer = new PrintWriter(file);

			traza.escribe(Traza.DEBUG, "Valor final de PI: " + valorPiObtenio);

			traza.escribe(Traza.TRACE, "Se pinta en el fichero el valor de PI final: " + valorPiObtenio);
			printer.write("Valor de PI final: " + valorPiObtenio);

			printer.close();
			writer.close();

			System.out.println("Fin de la escritura");

		} catch (IOException ioe) {
			ioe.printStackTrace();
			traza.escribe(Traza.ERROR, "Excepción capturada: " + ioe.getMessage());
		}
	}
}
