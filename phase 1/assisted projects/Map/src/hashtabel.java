import java.util.*;
public class hashtabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Ales");  
	      ht.put(5,"Rosy");  
	      ht.put(6,"Jack");  
	      ht.put(7,"John");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      

	}

}
