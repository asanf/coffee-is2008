package struttureDati.iterator;

/**
 * Interfaccia Iterable che verrà estesa dalle interfacce che faranno
 * uso di iteratori
 * @author Antonio Sanfelice, mat. 05102/00997
 *
 * @param <E> Tipo generico
 */

public interface Iterable<E> {
	
	/**
	 * Restituisce un iteratore degli elementi nella struttura
	 * @return Un iteratore degli elementi nella struttura
	 */
	public Iterator<E> iterator();

}
