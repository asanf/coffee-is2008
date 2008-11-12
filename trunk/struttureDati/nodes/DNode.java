package struttureDati.nodes;

import struttureDati.nodeList.InvalidPositionException;
import struttureDati.nodeList.Position;

/**
 * Classe nodo che implementa Position
 * @author Antonio Sanfelice, mat. 05102/00997
 *
 * @param <E>
 */
public class DNode<E> implements Position<E>{
	
	private DNode<E> prev, next;
	private E element;
	
	/**
	 * Crea una nuovo nodo
	 * @param newPrev nodo precedente
	 * @param newNext nodo successivo
 	 * @param elem elemento da memorizzare
	 */
	public DNode(DNode<E> newPrev, DNode<E> newNext, E elem)
	{
		prev = newPrev;
		next = newNext;
		element = elem;
	}
	
	public E element() throws InvalidPositionException
	{
		if((prev==null) && (next==null))
			throw new InvalidPositionException("La posizione non è in una lista");
		return element;
	}
	
	//Metodi di accesso
	public DNode<E> getPrev(){ return prev; }
	public DNode<E> getNext(){ return next; }
	
	//Metodi di aggiornamento
	public void setPrev(DNode<E> newPrev){ prev = newPrev; }
	public void setNext(DNode<E> newNext){ next = newNext; }
	public void setElement(E newElement){ element = newElement; }

}
