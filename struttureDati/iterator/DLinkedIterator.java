package struttureDati.iterator;
import java.util.NoSuchElementException;
import struttureDati.nodes.DLNode;

/**
 * Classe che implementa l'interfaccia iterator 
 * utilizzando una double linked list
 * @author Antonio Sanfelice, mat. 05102/00997
 *
 * @param <E>
 */
public class DLinkedIterator<E> implements Iterator {

	private DLNode<E> header, trailer;
	private int size;
	
	public DLinkedIterator(E[] A){
		size = A.length;
		header = null;
		trailer = null;
		trailer.setPrev(header);
		header.setNext(trailer);
		
		for(int i = size - 1; i > 0; i--){
			
			DLNode<E> tmp = new DLNode<E>(A[i],header,header.getNext());
			header.setNext(tmp);
		}
	}
	
	public boolean hasNext() { return header.getNext().getElement()!=null; }
	
	/**
	 * Metodo che controlla se l'elemento corrente ha un predecessore
	 * @return True se il predecessore esiste, false altrimenti
	 */
	public boolean hasPrev() { return trailer.getPrev().getElement()!=null; }

	
	public E next() throws NoSuchElementException {
		if(!hasNext())
			throw new NoSuchElementException("No such element");
		E toReturn = header.getNext().getElement();
		header = header.getNext();
		size--;
		return toReturn;
	}
	
	/**
	 * Metodo che restituisce l'elemento precedente a quello attuale
	 * @return L'elemento precedente
	 * @throws NoSuchElementException
	 */
	public E prev() throws NoSuchElementException {
		if(!hasPrev())
			throw new NoSuchElementException("No such element");
		E toReturn = trailer.getPrev().getElement();
		trailer = trailer.getPrev();
		size--;
		return toReturn;
	}

}
