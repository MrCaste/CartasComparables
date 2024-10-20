package M1_T06_P25;

public class Carta implements Comparable<Carta>{
	
	private final String numero;
    private final String palo;

    public Carta(String numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @return the palo
     */
    public String getPalo() {
        return palo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 47 * hash + (this.palo != null ? this.palo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.palo != other.palo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return numero + " " + palo;
    }

	/**
	 * Compare to.
	 *
	 * @param other the other
	 * @return the int
	 */
	@Override
	public int compareTo(Carta other) {
	  int palocomparison = this.palo.compareTo(other.palo);
	    if(palocomparison != 0) {
	      return palocomparison;
	    }
	return compararNumeros(this.numero,other.numero);
	}
	
	public int compararNumeros(String numero1, String numero2) {
		  String[] ordenNumeros = {"AS", "DOS", "TRES", "CUATRO","CINCO", "SEIS", "SIETE", "SOTA", "CABALLO", "REY"};
		  
		  int index1 = obtenerIndice(numero1, ordenNumeros);
		  int index2 = obtenerIndice(numero2, ordenNumeros);
		  
		  return Integer.compare(index1, index2);
		}

		public int obtenerIndice(String numero, String[] ordenNumeros) {
		  for (int indice = 0; indice < ordenNumeros.length; indice++) {
		    if(ordenNumeros[indice] == numero) {
		      return indice;
		    }
		  }
		  return -1;
		}
}



