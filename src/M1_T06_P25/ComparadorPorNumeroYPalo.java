package M1_T06_P25;

import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class ComparadorPorNumeroYPalo.
 */
public class ComparadorPorNumeroYPalo implements Comparator<Carta> {

	/**
	 * Compare.
	 *
	 * @param c1 the c 1
	 * @param c2 the c 2
	 * @return the int
	 */
	@Override
	public int compare(Carta c1, Carta c2) {
	  int numeroComparison = compararNumeros(c1.getNumero(),c2.getNumero());
	  if(numeroComparison != 0) {
	    return numeroComparison;
	  }
		return c1.getPalo().compareTo(c2.getPalo());
	}
	
	/**
	 * Comparar numeros.
	 *
	 * @param numero1 the numero 1
	 * @param numero2 the numero 2
	 * @return the int
	 */
	public int compararNumeros(String numero1, String numero2) {
	  String[] ordenNumeros = {"AS", "DOS", "TRES", "CUATRO","CINCO", "SEIS", "SIETE", "SOTA", "CABALLO", "REY"};
	  
	  int index1 = obtenerIndice(numero1, ordenNumeros);
	  int index2 = obtenerIndice(numero2, ordenNumeros);
	  
	  return Integer.compare(index1, index2);
	}

	/**
	 * Obtener indice.
	 *
	 * @param numero the numero
	 * @param ordenNumeros the orden numeros
	 * @return the int
	 */
	public int obtenerIndice(String numero, String[] ordenNumeros) {
	  for (int indice = 0; indice < ordenNumeros.length; indice++) {
	    if(ordenNumeros[indice] == numero) {
	      return indice;
	    }
	  }
	  return -1;
	}
	

}
