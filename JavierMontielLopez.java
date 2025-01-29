package  ;
	
	/*
	 * Esta clase contiene métodos para realizar diversos procesos, incluyendo la ordenación de un array y calculos de nivel de calidad
	 * @author Javier Montiel López
	*/
public class JavierMontielLopez {

	/*
	 * Ordena un array de enteros utilizando el algoritmo de la burbuja
	 * 
	 * @param array El array de enteros a ordenar
	 * @return El array ordenado
	 */
	public int[] ordenarBurbuja(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	/*
	 * Calcula el nivel de calidad promedio de un conjunto de valores. Si el promedio es 
     * menor a 3.5, se asigna un nivel de calidad mínimo de 3.5. De lo contrario, se asigna 
     * un nivel de calidad de 2.5.
     * 
     * @param calidades Un array de valores que representan las calidades.
     * @return El nivel de calidad promedio ajustado
	 * */
	public static double calcularNivelDeCalidad(double[] calidades) {
		double suma = 0;
		for (double c : calidades) {
			suma += c;
		}
		double media = suma / calidades.length;

		if (media < 3.5) {
			return 3.5;
		} else {
			return 2.5;
		}
	}

	/**
     * Ajusta el nivel de calidad de un producto o servicio en función de la valoración del 
     * cliente. Si la valoración es igual o superior a 3, se suma 1.5 al nivel de calidad.
     *
     * @param calidad El nivel de calidad actual.
     * @param valoracionCliente La valoración del cliente (entre 1 y 5).
     * @return El nivel de calidad ajustado.
    */
	public static double ajustarPorValoracion(double calidad, double valoracionCliente) {
		if (valoracionCliente >= 3) {
			return calidad + 1.5;
		}
		return calidad;
	}
}
