package struttureDati.nodeList;
import struttureDati.iterator.Iterator;
import struttureDati.iterator.Iterable;
import struttureDati.nodes.DNode;

/**
 * Classe che implementa il TDA PositionList 
 * tramite una lista doppiamente linkata
 * 
 * @author Antonio Sanfelice, mat. 05102/00997
 *
 * @param <E> il tipo generico
 */
public class NodePositionList<E> implements PositionList<E> {

	protected int numElts;
	protected DNode<E> header, trailer;
	
	public NodePositionList(){
		numElts = 0;
		header = new DNode<E>(null,null,null);
		trailer = new DNode<E>(header,null,null);
		header.setNext(trailer);
	}
	
	protected DNode<E> checkPosition(Position<E> p) 
		throws InvalidPositionException {
		if(p==null)
			throw new InvalidPositionException("é stata passata una posizione null");
		if(p==header)
			throw new InvalidPositionException("l'header non è una posizione valida");
		if(p==trailer)
			throw new InvalidPositionException("Il trailer non è una posizione valida");
		try{
			DNode<E> temp = (DNode<E>) p;
			if((temp.getPrev()==null) || (temp.getNext()==null))
				throw new InvalidPositionException("La posizione non si trova in una lista valida");
			return temp;
		}catch(ClassCastException e){
			throw new InvalidPositionException("La posizione non è di un tipo adatto a questa lista");
		}
	}
	
	
	public void addAfter(Position<E> p, E e) {
		DNode<E> v = checkPosition(p);
		numElts++;
		DNode<E> newNode = new DNode<E>(v,v.getNext(),e);
		v.getNext().setPrev(newNode);
		v.setNext(newNode);
	}

	public void addBefore(Position<E> p, E e) {
		DNode<E> v = checkPosition(p);
		numElts++;
		DNode<E> newNode = new DNode<E>(v.getPrev(),v,e);
		v.getPrev().setNext(newNode);
		v.setPrev(newNode);
	}

	public void addFirst(E e) {
		numElts++;
		DNode<E> newNode = new DNode<E>(header,header.getNext(),e);
		header.getNext().setPrev(newNode);
		header.setNext(newNode);
	}

	public void addLast(E e) {
		numElts++;
		DNode<E> newNode = new DNode<E>(trailer.getPrev(),trailer,e);
		trailer.getPrev().setNext(newNode);
		trailer.setPrev(newNode);
	}

	public Position<E> first() {
		if(isEmpty())
			throw new EmptyListException("Lista vuota");
		return header.getNext();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public Position<E> last() {
		if(isEmpty())
			throw new EmptyListException("Lista vuota");
		return trailer.getPrev();
	}

	public Position<E> next(Position<E> p) throws InvalidPositionException, BoundaryViolationException {
		DNode<E> v = checkPosition(p);
		DNode<E> next = v.getNext();
		if(next==null)
			throw new BoundaryViolationException("Impossibile scorrere oltre la fine della lista");
		return next;
	}

	public Position<E> prev(Position<E> p) throws InvalidPositionException, BoundaryViolationException {
		DNode<E> v = checkPosition(p);
		DNode<E> prev = v.getPrev();
		if(prev==null)
			throw new BoundaryViolationException("Impossibile leggere prima dell'inizio della lista");
		return prev;
	}

	public E remove(Position<E> p) {
		DNode<E> v = checkPosition(p);
		numElts--;
		DNode<E> vPrev = v.getPrev();
		DNode<E> vNext = v.getNext();
		vPrev.setNext(vNext);
		vNext.setPrev(vPrev);
		E vElem = v.element();
		v.setNext(null);
		v.setPrev(null);
		return vElem;
	}

	public E set(Position<E> p, E e) {
		DNode<E> v = checkPosition(p);
		E oldElem = v.element();
		v.setElement(e);
		return oldElem;
	}

	public int size() {
		return numElts;
	}

	public Iterator<E> iterator() {
		return new PositionIterator<E>(this);
	}
	
	public Iterable<Position<E>> positions(){
		PositionList<Position<E>> P = new NodePositionList<Position<E>>();
		
		if(!isEmpty()){ // se ci sono elementi
			Position<E> p = first(); //inizializza un cursore p a first()
			while(true){
				P.addLast(p); 	// aggiungi p alla fine di P
				if(p == last()) // e se p è l'ultimo elemento
					break; 		// fermati
				p = next(p); 	// altrimenti sposta p in avanti di una posizione
			}
		}
			
		return P;
	}

	public String toString()
	{
		Iterator<E> it = iterator();
		String toReturn = "[";
		while(it.hasNext())
		{
			toReturn += it.next();
			if(it.hasNext())
				toReturn += ", ";
		}
		toReturn += "]";
		return toReturn;
	}
	
	
}
