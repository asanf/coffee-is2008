package struttureDati.arrayList;

import java.util.NoSuchElementException;

import struttureDati.iterator.Iterator;

public class IndexIterator<E> implements Iterator<E> {
	
	private IndexList<E> list;
	private int cursor;
	
	/**
	 * Costruisce un nuovo iteratore a partire da una IndexList
	 * @param L L'IndexList di cui si desidera l'iteratore
	 */
	public IndexIterator(IndexList<E> L){
		list = L;
		/*
		 * la lista è vuota?
		 * si -> cursor = -1
		 * no -> cursor = 0
		 */
		cursor = list.isEmpty() ? -1 : 0;
	}

	public boolean hasNext() { return cursor>=0;}

	public E next() throws NoSuchElementException{
		
		if(cursor < 0)
			throw new NoSuchElementException("Elemento successivo inesistente");
		
		E toReturn = list.get(cursor);
		
		/*
		 * il cursore punta all'ultimo elemento della lista?
		 * si -> cursor = -1
		 * no -> cursor++
		 */
		cursor = cursor == list.size()-1 ? -1 : cursor+1;
		
		return toReturn;
	}

}
