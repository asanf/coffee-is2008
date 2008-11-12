package struttureDati.iterator;
import java.util.NoSuchElementException;
import struttureDati.nodes.Node;

/**
 * Classe che implementa un iteratore tramite linked list
 * @author Antonio Sanfelice, mat. 05102/00997
 *
 * @param <E> tipo generico
 */

public class LinkedIterator<E> implements Iterator<E>{
	
	private Node<E> head;
	private int size;
	
	public LinkedIterator(E[] A){
		head = null;
		size = A.length;
		
		for(int i = size - 1; i > 0; i--)
		{
			Node<E> tmp = new Node<E>(A[i],head);
			head = tmp;
		}
		
	}

	public boolean hasNext() { return size > 0; }

	public E next() throws NoSuchElementException {
		if(!hasNext())
			throw new NoSuchElementException("Non c'è elemento successivo");
		E toReturn = head.getElement();
		head = head.getNext();
		size--;
		return toReturn;
	}
	
	

	
	
}
