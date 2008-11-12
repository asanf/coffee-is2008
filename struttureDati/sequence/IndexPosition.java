package struttureDati.sequence;
import struttureDati.nodeList.Position;

/**
 * Classe di comodo per l'implementazione di ArraySequence
 * Implementa Position aggiungendo anche un indice
 * @author Antonio Sanfelice, mat. 05102/00997
 */
public class IndexPosition<E> implements Position<E>{
	
	private int index;
	private E element;
	
	public IndexPosition(int index, E element)
	{
		this.index = index;
		this.element = element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public E element() {
		return element;
	}
}
