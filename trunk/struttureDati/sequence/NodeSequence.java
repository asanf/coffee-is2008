package struttureDati.sequence;
import struttureDati.arrayList.IndexOutOfBoundsException;
import struttureDati.nodeList.*;
import struttureDati.nodes.DNode;

/**
 * Classe che implementa il TDA Sequence mediante una lista doppiamente linkata
 * @author Antonio Sanfelice, mat. 05102/00997
 */
public class NodeSequence<E> extends NodePositionList<E> implements Sequence<E> {

	protected void checkIndex(int index,int n) throws BoundaryViolationException
	{
		if(index < 0 ||index >=n){
			throw new BoundaryViolationException("L'indice " + index +" non è valido per questa sequenza");
		}
	}
	
	public Position<E> atIndex(int index) throws BoundaryViolationException{
		
		checkIndex(index,size());
		DNode<E> node;
		
		if(index < size()/2){
			node = header.getNext();
			for(int i=0; i < index; i++)
				node = node.getNext();
		}else{
			node=trailer.getPrev();
			for(int i=1; i < size() - index; i++)
				node = node.getPrev();
		}
		
		return node;
	}
	
	public int indexOf(Position<E> p) throws InvalidPositionException{
		
		DNode<E> toReach = checkPosition(p);
		DNode<E> tmp = header.getNext();
		int i=0;
		while(tmp!=toReach){
			i++;
			tmp = tmp.getNext();
		}
		return i;
	}

	public E getFirst() throws EmptySequenceException {
		
		if(isEmpty())
			throw new EmptySequenceException("Sequenza vuota");
		
		return header.getNext().element();
	}

	public E getlast() throws EmptySequenceException {
		
		if(isEmpty())
			throw new EmptySequenceException("Sequenza vuota");
		
		return trailer.getPrev().element();
	}

	public E removeFirst() throws EmptySequenceException {
		if(isEmpty())
			throw new EmptySequenceException("Sequenza vuota");
		
		E toReturn = header.getNext().element(); // Recupero l'elemento che verrà eliminato
		
		header.setNext(header.getNext().getNext()); // Collego header al secondo nodo
		header.getNext().setPrev(null); // e setto il primo a null
		
		return toReturn;
	}

	public E removeLast() throws EmptySequenceException {
		E toReturn = trailer.getPrev().element();
		
		trailer.setPrev(trailer.getPrev().getPrev());
		trailer.getPrev().setNext(null);
		
		return toReturn;
	}

	public void add(int i, E element) throws IndexOutOfBoundsException {
		
		if(i == size())
			addLast(element);
		else{
			checkIndex(i,size());
			addBefore(atIndex(i),element);
		}
		
	}

	public E get(int i) throws IndexOutOfBoundsException {
		checkIndex(i,size());
		return atIndex(i).element();
	}

	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i,size());
		return remove(atIndex(i));
	}

	public E set(int i, E element) throws IndexOutOfBoundsException {
		checkIndex(i,size());
		return set(atIndex(i),element);
	}

}
