package struttureDati.arrayList;
import struttureDati.iterator.Iterable;
/**
 * Interfaccia associata al TDA ArrayList
 * @author Antonio Sanfelice, mat. 05102/00997
 *
 * @param <E> il tipo generico
 */

public interface IndexList<E> extends Iterable<E>{

	/**
	 * Restituisce il numero di elementi contenuti nella struttura
	 * @return un intero che indica il numero di elementi
	 */
	public int size();
	
	/**
	 * Controlla se la struttura è vuota
	 * @return true se la struttura è vuota, false altrimenti
	 */
	public boolean isEmpty();
	
	/**
	 * Rimuove l'elemento con indice i dalla lista
	 * @param i L'indice dell'elemento da rimuovere
	 * @return L'elemento rimosso
	 * @throws IndexOutOfBoundsException Quando l'indice è fuori range
	 */
	public E remove(int i) throws IndexOutOfBoundsException;
	
	/**
	 * Recupera l'elemento con indice i dalla lista
	 * @param i L'indice dell'elemento da recuperare
	 * @return L'elemento di indice i
	 * @throws IndexOutOfBoundsException Se l'indice fornito non è valido
	 */
	public E get(int i) throws IndexOutOfBoundsException;
	
	/**
	 * Aggiunge un nuovo elemento nella lista con indice i
	 * @param i L'indice del nuovo elemento	
	 * @param element L'elemento da inserire
	 * @throws IndexOutOfBoundsException Se l'indice fornito non è valido
	 */
	public void add(int i, E element) throws IndexOutOfBoundsException;
	
	/**
	 * Rimpiazza l'elemento di indice i con element
	 * @param i L'indice dell'elemento da modificare
	 * @param element L'elemento da inserire
	 * @return Il vecchio elemento 
	 * @throws IndexOutOfBoundsException Se l'indice fornito non è valido
	 */
	public E set(int i, E element) throws IndexOutOfBoundsException;
	
	
}
