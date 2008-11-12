package arrayList;
/**
 * Eccezione lanciata quando si fornisce un indice fuori range
 * @author Antonio Sanfelice, mat. 05102/00997
 *
 */
@SuppressWarnings("serial")
public class IndexOutOfBoundsException extends RuntimeException{
	
	public IndexOutOfBoundsException(String message){
		super(message);
	}
	
}
