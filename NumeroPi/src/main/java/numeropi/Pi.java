package numeropi;

/**
 * Clase encargada de calcular el número PI
 * 
 * @author Ángel Cadenas
 */

public class Pi {

	static Traza traza = new Traza(Pi.class);

	public static double valorFinalPi;

	/**
	 * Método encargado de calcular el valor de PI mediante iteraciones
	 */

	private static double calcPi(final int iterations) {
		if (iterations >= 1000000) {
			traza.escribe(Traza.WARN, "El número de iteraciones es bastante alto");
		}
		double x;
		double y;
		int successCount = 0;
		double valorIteracion = 0;
		for (int i = 0; i <= iterations; i++) {
			x = Math.random();
			y = Math.random();
			if ((Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
				successCount++;
			}
			valorIteracion = (double) (4 * successCount) / iterations;

			traza.escribe("Valor de la iteración: " + valorIteracion);
		}
		return valorIteracion;
	}

	public static void main(String[] args) {
		traza.escribe("Entramos en main");
		Pi pi = new Pi();

		valorFinalPi = pi.calcPi(1000000);

		traza.escribe(Traza.TRACE,
				"Llamada a imprimirValorFinal de la clase UtilidadesFicheros con valor: " + valorFinalPi);

		UtilidadesFicheros.imprimirValorFinalPi(valorFinalPi);

		traza.escribe(Traza.TRACE,
				"Salimos de imprimirValorFinal de la clase UtilidadesFicheros con valor: " + valorFinalPi);

		traza.escribe("Salimos de main");
	}
}
