package struttureDati.nodes;

/**
 * Classe che modella un nodo
 * 
 * @author Antonio Sanfelice, mat. 05102/00997
 *
 * @param <E> Il tipo di dati che il nodo deve memorizzare
 */
public class Node<E> {

	private E element;
	private Node<E> next;
	
	/** Costruttore senza parametri*/
	public Node(){
		this(null,null);
	}
	
	/**
	 * Costruisce un nodo contenente un dato elemento e 
	 * con un dato nodo next
	 * @param element l'elemento da conservare nel nodo
	 * @param next il prossimo nodo
	 */
	public Node(E element, Node<E> next){
		this.element = element;
		this.next = next;
	}
	
	//Metodi di accesso
	
	/**
	 * @return l'elemento memorizzato nel nodo
	 */
	public E getElement(){
		return element;
	}
	
	/**
	 * @return il prossimo nodo
	 */
	public Node<E> getNext(){
		return next;
	}
	
	//Metodi modificatori
	/**
	 * Sostituisce l'elemento memorizzato con un nuovo elemento
	 * @param newEl Il nuovo elemento da memorizzare
	 */
	public void setElement(E newEl){
		element = newEl;
	}
	
	/**
	 * Sostituisce il prossimo nodo con un nuovo nodo
	 * 
	 * @param newNode il nuovo nodo successivo
	 */
	public void setNext(Node<E> newNode){
		next = newNode;
	}
	
}
