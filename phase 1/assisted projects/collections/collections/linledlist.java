package collections;
import java.util.*;
public class linledlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Alex");  
	      names.add("John");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  

	}

}
}
