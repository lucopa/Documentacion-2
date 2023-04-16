/** Producto de dos numeros reales, tendrá 2 parametros de entrada y uno de salida que será la solución.
 * Producto de dos numeros enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
 * Producto de tres numeros reales, tendrá 3 parametros de entrada y uno de salida que será la solución.
 * Potencia, tiene 1 parametro como base, otro como exponente y uno de salida que es la solución.
 */



package calculadora;

/**
 * Clase en la que se engloban todos los metodos del producto en la calculadora
 * @see Calculadora
 * @author Luis Cobler Parra
 * @version 1.0.0
 * @since 16/04/2023
 */


public class Producto {


	//Metodos
	/**
	 * 
	 * @param a Parametro 1 del producto, de tipo real
	 * @param b Parametro 2 del producto, de tipo real
	 * @return Resultado del producto de 2 numeros reales
	*/

	
	public float dosReales(float a, float b) {
		return a*b;
	}

	/**
	 * 
	 * @param a Parametro 1 del producto, de tipo entero
	 * @param b Parametro 2 del producto, de tipo entero
	 * @return Resultado del producto de 2 numeros enteros
	 */
	
	public int dosEnteros(int a, int b) {
		return a*b;
	}

	/**
	 * 
	 * @param a Parametro 1 del producto, de tipo real
	 * @param b
	 * @param c
	 * @return
	 */
	
	public float tresReales(float a, float b, float c) {
		return a*b*c;
	}
	
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
}
