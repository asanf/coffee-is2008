package struttureDati.sequence;
import struttureDati.arrayList.IndexList;
import struttureDati.nodeList.*;
import struttureDati.arrayList.*;
import struttureDati.iterator.Iterable;

/**
 * Interfaccia per il tda Sequence
 * @author Antonio Sanfelice, mat. 05102/00997
 */
public interface Sequence<E> extends PositionList<E>, IndexList<E>, Iterable<E>{
	
	/**
	 * Metodo che restituisce la posizione all'indice index
	 * @param index L'indice della posizione che si vuole recuperare
	 * @return La posizione all'indice index
	 * @throws BoundaryViolationException se l'indice è fuori del range
	 */
	public Position<E> atIndex(int index) throws BoundaryViolationException;
	
	/**
	 * Metodo che restituisce l'indice della position passata come parametro
	 * @param p La position di cui si vuole recuperare l'indice
	 * @return L'indice della position indicata
	 * @throws InvalidPositionException se la posizione indicata non è valida
	 */
	public int indexOf(Position<E> p) throws InvalidPositionException;
	
	/**
	 * Recupera il primo elemento della sequenza
	 * @return Il primo elemento della sequenza
	 * @throws EmptySequenceException
	 */
	public E getFirst() throws EmptySequenceException;
	
	/**
	 * Recupera l'ultimo elemento della sequenza
	 * @return L'ultimo elemento della sequenza
	 * @throws EmptySequenceException
	 */
	public E getlast() throws EmptySequenceException;
	
	/**
	 * Rimuove il primo elemento della sequenza
	 * @return Il primo elemento della sequenza
	 * @throws EmptySequenceException
	 */
	public E removeFirst() throws EmptySequenceException;
	
	/**
	 * Rimuove l'ultimo elemento della sequenza
	 * @return L'ultimo elemento della sequenza
	 * @throws EmptySequenceException
	 */
	public E removeLast() throws EmptySequenceException;
	

}
