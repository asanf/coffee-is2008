package arrayList;
import struttureDati.iterator.Iterator;
import struttureDati.iterator.Iterable;

/**
 * Classe che implementa il TDA ArrayList tramite un array dinamico
 * @author Antonio Sanfelice, mat. 05102/00997
 *
 * @param <E> il tipo generico
 */


public class ArrayIndexList<E> implements IndexList<E>, Iterable<E>{

	private E[] A;
	private int size,front;
	/**
	 * Crea un arraylist di grandezza prefissata a 1024 elementi
	 *
	 */
	public ArrayIndexList(){
		this(1024);
	}
	
	/**
	 * Crea un'arraylist di dimensione "capacity"
	 * @param capacity La dimensione desiderata per l'arraylist
	 */
	@SuppressWarnings("unchecked")
	public ArrayIndexList(int capacity){
		A = (E[]) new Object[capacity];
		size = 0;
		front = 0;
	}
	
	/***
	 * Metodo che controlla la validità dell'indice
	 * @param i L'indice da controllare
	 * @throws IndexOutOfBoundsException
	 */
	private void checkIndex(int i) throws IndexOutOfBoundsException
	{
		if(i<0)
			throw new IndexOutOfBoundsException("Indice negativo");
		if(i>size())
			throw new IndexOutOfBoundsException("Indice fuori range");
	}
	
	/***
	 * Metodo che trasforma un indice logico in un indice fisico
	 * @param i L'indice da adattare
	 * @return Il corrispettivo indice fisico
	 * @throws IndexOutOfBoundsException
	 */
	private int adaptIndex(int i)
	{
		/*
		 * Essendo l'array circolare gli indici logici e quelli fisici 
		 * differiscono, quindi questa operazione viene richiamata spesso.
		 * Ne ho dunque fatto un metodo in modo da migliorare 
		 * la leggibilità del codice
		 */
		return (front+i+A.length)%A.length;
		
	}
	
	/***
	 * Inserisce un elemento all'indice logico i, raddoppiando la grandezza dell'arraylist 
	 * se questa è piena
	 * @param i L'indice logico ove inserire l'elemento
	 * @param element L'elemento da inserire
	 * @throws IndexOutOfBoundsException
	 */
	@SuppressWarnings("unchecked")
	public void add(int i, E element) throws IndexOutOfBoundsException {
		if(size()==A.length) // se la struttura è piena
		{
			E[] tmp = (E[]) new Object[2*A.length]; //crea un nuovo array grande il doppio
			
			for(int c=0;c<size();c++)
			{
				tmp[c]=A[front];		//copio gli elementi dal vecchio al nuovo array
				front = adaptIndex(1);  //sposto front in avanti di 1
				
			}
			A=tmp;					// sostituisco il vecchio array
			front=0;				// e azzero front
		}
		checkIndex(i);
		
		int realIndex = adaptIndex(i);
		
		if((realIndex == front) && !isEmpty()){
			front = adaptIndex(-1);
			realIndex = front;
		
		}
		
		else if(A[realIndex]!=null){
			
			for(int c = size();c > i;c--)
			{
				A[adaptIndex(c)]=A[adaptIndex(c-1)]; // sposto gli elementi a destra
			}
		}
		
		A[realIndex]=element; // dopodichè inserisco l'elemento
		
		size++;		//e incremento il contatore size
	}
	

	public E get(int i) throws IndexOutOfBoundsException {
		checkIndex(i);
		/*ho dovuto aggiungere questa riga in quanto l'indice size() è valido
		per l'inserimento, ma non lo è per get*/
		if(i==size()) throw new IndexOutOfBoundsException("Indice fuori range");
		return A[adaptIndex(i)];
	}

	public boolean isEmpty() {
		return size()==0;
	}

	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i);
		/*ho dovuto aggiungere questa riga in quanto l'indice size() è valido
		per l'inserimento, ma non lo è per la rimozione*/
		if(i==size()) throw new IndexOutOfBoundsException("Indice fuori range");
		int realIndex = adaptIndex(i);
		E toReturn;
		if(realIndex==front) // se si deve rimuovere il primo elemento
		{
			toReturn = A[front]; // salvo l'elemento in una variabile temporanea
			A[front] = null; // setto a null per evitare problemi di consistenza delle informazioni
			front = adaptIndex(+1); // sposto il front in avanti di uno
		} else { //per l'elemento generico invece 
			toReturn=A[realIndex]; //salvo in una variabile temporanea
			for(int c=i;c<size();c++)  //quindi sposto gli elementi a sinistra da i in poi
				A[adaptIndex(c)]=A[adaptIndex(c+1)];
		}
		size--; 
		return toReturn;
	}

	public E set(int i, E element) throws IndexOutOfBoundsException {
		checkIndex(i);
		int realIndex = adaptIndex(i);
		E toReturn = A[realIndex];
		A[realIndex] = element;
		return toReturn;
	}


	public int size() {
		return size;
	}

	public Iterator<E> iterator() {
		return new IndexIterator<E>(this);
	}
	
	public String toString(){
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
