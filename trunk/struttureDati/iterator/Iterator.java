package struttureDati.iterator;

/**
 * Interfaccia per il tda Iterator
 * @author Antonio Sanfelice, mat. 05102/00997
 *
 * @param <E> il tipo generico
 */
public interface Iterator<E> {
	
	/**
	 * Metodo che controlla se esiste un elemento successivo a quello corrente
	 * @return True se tale elemento esiste, false altrimenti
	 */
	public boolean hasNext();
	
	/**
	 * Metodo che restituisce l'elemento successivo a quello corrente
	 * @return L'elemento successivo a quello corrente
	 */
	public E next();

}
