package struttureDati.arrayList.test;
import struttureDati.arrayList.ArrayIndexList;
import struttureDati.arrayList.IndexOutOfBoundsException;
public class ArrayIndexListTest {
	
	public static void main(String[] args) {
		
		ArrayIndexList<String> arraylist = new ArrayIndexList<String>(10);
		
		System.out.println("size(), isEmpty(): " + arraylist.size() + ", " + arraylist.isEmpty());
		
		System.out.println("Aggiungo due elementi all'indice 0: 'primo','secondo'");
		
		arraylist.add(0, "primo");
		arraylist.add(0, "secondo");
		
		System.out.println("add(-15,errore): mi aspetto IndexOutOfBoundsException");
		try{
			arraylist.add(-15, "errore");
		}catch(IndexOutOfBoundsException e)
		{System.out.println(e);}
		
		System.out.println();
		System.out.println("add(30,errore): mi aspetto IndexOutOfBoundsException");
		try{
			arraylist.add(30, "errore");
		}catch(IndexOutOfBoundsException e)
		{System.out.println(e);}
		
		
		System.out.println("get(0), get(1)");
		System.out.println(arraylist.get(0) + ", " + arraylist.get(1));
		
		System.out.println();
		
		System.out.println("Inserisco elementi sino a che l'array non è costretto ad espandersi:");
		
		for(int i=2;i<11;i++)
		{arraylist.add(i,"Str" + i);}
		System.out.println("size(), isEmpty(): " + arraylist.size() + ", " + arraylist.isEmpty());
		System.out.println();
		System.out.println(arraylist);
		System.out.println();
		int indexToRemove = arraylist.size()-2;
		System.out.println("effettuo 3 remove all'indice " + indexToRemove + ":" );
		System.out.println("(Mi aspetto che la terza dia errore)");
		for(int i=0;i<3;i++)
		{
			try{
				System.out.println(arraylist.remove(indexToRemove));
			}catch(Exception e){System.out.println(e);}
		}
		
		
		
		System.out.println("size(), isEmpty(): " + arraylist.size() + ", " + arraylist.isEmpty());
		
		System.out.println(arraylist);
		
		System.out.println();
		System.out.println("add(size()/2,inMezzo)");
		arraylist.add(arraylist.size()/2, "inMezzo");
		
		System.out.println(arraylist);
		
		
	}
}
