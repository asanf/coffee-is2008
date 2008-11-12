package struttureDati.nodeList;
import struttureDati.iterator.Iterable;

/***
 * Interfaccia associata al TDA PositionList
 * @author Antonio Sanfelice, mat. 05102/00997
 *
 * @param <E> il tipo generico
 * 
 */

public interface PositionList<E> extends Iterable<E>{
	
	
	/**
	 * Restituisce il numero di elementi nella struttura
	 * @return Il numero di elementi
	 */
	public int size();
	
	/**
	 * Controlla se la struttura è vuota
	 * @return true se la struttura è vuota, false altrimenti
	 */
	public boolean isEmpty();
	
	/**
	 * Restituisce il primo nodo della lista
	 * @return Il primo nodo della lista
	 */
	public Position<E> first();
	
	/**
	 * Restituisce l'ultimo nodo della lista
	 * @return L'ultimo nodo della lista
	 */
	public Position<E> last();
	
	/**
	 * Restituisce la posizione successiva ad una data posizione
	 * @param p La posizione di partenza
	 * @return La posizione successiva a quella passata per parametro
	 * @throws InvalidPositionException
	 * @throws BoundaryViolationException
	 */
	public Position<E> next(Position<E> p) 
		throws InvalidPositionException,BoundaryViolationException;
	
	/**
	 * Restituisce la posizione precedente ad una data posizione
	 * @param p La posizione di partenza
	 * @return La posizione precedente a quella passata per parametro
	 * @throws InvalidPositionException
	 * @throws BoundaryViolationException
	 */
	public Position<E> prev(Position<E> p)
		throws InvalidPositionException,BoundaryViolationException;
	
	/**
	 * Aggiunge un elemento in testa, creando un nuovo nodo
	 * @param e L'elemento da inserire
	 */
	public void addFirst(E e);
	
	/**
	 * Aggiunge un elemento in coda, creando un nuovo nodo
	 * @param e L'elemento da inserire
	 */
	public void addLast(E e);
	
	/**
	 * Inserisce un elemento creando un nuovo nodo e 
	 * posizionandolo dopo la posizione passata per parametro
	 * @param p La posizione di riferimento 
	 * @param e l'elemento da inserire
	 */
	public void addAfter(Position<E> p, E e);
	
	/**
	 * Inserisce un elemento creando un nuovo nodo e 
	 * posizionandolo prima della posizione passata per parametro
	 * @param p La posizione di riferimento 
	 * @param e l'elemento da inserire
	 */
	public void addBefore(Position<E> p, E e);
	
	/**
	 * Rimuove un data posizione
	 * @param p La posizione da rimuovere
	 * @return La posizione rimossa
	 */
	public E remove(Position<E> p);
	
	/**
	 * Modifica una data posizione inserendovi un nuovo elemento
	 * @param p La posizione da modificare
	 * @param e Il nuovo valore
	 * @return Il valore precedente
	 */
	public E set(Position<E> p, E e);
	
	
}
