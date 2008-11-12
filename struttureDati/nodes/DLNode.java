package struttureDati.nodes;

/**
 * Classe che modella il generico nodo di una lista doppiamente linkata
 * 
 * @author Antonio Sanfelice, mat. 05102/00997
 *
 * @param <E> il tipo generico
 */

public class DLNode<E> {

	private E element;
	private DLNode<E> next;
	private DLNode<E> prev;
	
	/**
	 * Costruttore: costruisce un nodo vuoto
	 *
	 */
	public DLNode(){
		this(null,null,null);
	}
	
	/**
	 * Costruttore: costruisce un nodo con i valori passati per parametro
	 * @param e L'elemento da inserire
	 * @param p Il nodo precedente
	 * @param n Il nodo successivo
	 */
	public DLNode(E e, DLNode<E> p, DLNode<E> n){
		element = e;
		prev = p;
		next = n;
	}
	
	//Metodi di modifica
	
	public void setElement(E newElement){
		element = newElement;
	}
	
	public void setPrev(DLNode<E> newPrev){
		prev = newPrev;
	}
	
	public void setNext(DLNode<E> newNext){
		next = newNext;
	}
	
	//Metodi di accesso
	
	public E getElement(){ return element; }
	
	public DLNode<E> getPrev(){ return prev; }
	
	public DLNode<E> getNext(){ return next; }
	
	
}
