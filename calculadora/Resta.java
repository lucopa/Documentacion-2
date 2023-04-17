/*Resta de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
Una resta de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
Resta de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
 */
package calculadora;
/**
 * Clase en la que se engloba todo los elementos de la calculadora
 * @see calculadora
 * @author Santi Fuentes Espinosa
 * @version 1.0.0
 * @since 17/04/23
 */
public class Resta {
	
	public float valorAcumulado;
	/**
	 * @return devuelve el valor acomulado 
	 */
	
	public float getValorAcumulado() {
		return valorAcumulado;
	}

	public void setValorAcumulado(float valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
	/**
	 * @param a primer valor de la resta 
	 * @param b segundo valor de la resta 
	 * @return devuelve el resultado de la resta de dos numero reales
	 */
	public float dosReales(float a, float b) {
		return a-b;
	}
	/**
	 * @param a primer valor de la resta 
	 * @param b segundo valor de la resta 
	 * @return devuelve el resultado de la resta de dos numero enteros 
	 */
	public int dosEnteros(int a, int b) {
		return a-b;
	}
	/**
	 * @param a primer valor de la resta 
	 * @param b segundo valor de la resta 
	 * @param c tercer valor de la resta  
	 * @return devuelve el resultado de la resta de tres numero reales  
	 */	
	public float tresReales(float a, float b, float c) {
		return a-b-c;
	}
	/**
	 * @param a valor para el metodo de resta acumulado
	 * @return devuelve el metodo acumulado de la resta
	 */
	public float restaAcumulado(float a) {
		valorAcumulado = valorAcumulado - a;
		return valorAcumulado;
	}
}
