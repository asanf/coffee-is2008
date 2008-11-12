package struttureDati.nodeList;
import java.util.NoSuchElementException;
import struttureDati.iterator.Iterator;

public class PositionIterator<E> implements Iterator<E> {

	protected PositionList<E> list;
	protected Position<E> cursor;
	
	/**
	 * Crea un nuovo iteratore a partire da una PositionList
	 * @param L La position list di cui si vuole l'iteratore
	 */
	public PositionIterator(PositionList<E> L){
		list = L;
		/* la lista è vuota? 
		 * si -> cursor = null
		 * no -> cursor = list.first()
		 */
		cursor = list.isEmpty() ? null : list.first();
	}
	
	public boolean hasNext() {
		return cursor!=null;
	}

	public E next() throws NoSuchElementException {
		if(cursor == null)
			throw new NoSuchElementException("Prossimo elemento inesistente");
		
		E toReturn = cursor.element();
		
		/* Il cursore punta all'ultimo elemnto?
		 * si -> cursore = null
		 * no -> cursore = list.next()
		 */
		cursor = (cursor == list.last()) ? null : list.next(cursor);
			
		return toReturn;
	}

}
