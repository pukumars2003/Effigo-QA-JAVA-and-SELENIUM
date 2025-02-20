package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
		HashSet<String> h_set = new HashSet<String>();
		   
		          h_set.add("Red");
		          h_set.add("Green");
		          h_set.add("Black");
		          h_set.add("White");
		          h_set.add("Pink");
		          h_set.add("Yellow");

		  
		   System.out.println("The Hash Set: " + h_set);
		   
		   /*Iterator a=h_set.iterator();
		   
		   while(a.hasNext()) {
			   System.out.println(a.next());
		   }**/
		   
		   HashSet<String>h_set2 = new HashSet<String>();
	          h_set2.add("Red");
	          h_set2.add("Pink");
	          h_set2.add("Black");
	          h_set2.add("Orange");
	          System.out.println("Second HashSet content: "+h_set2);
	          h_set.retainAll(h_set2);
	          System.out.println("HashSet content:");
	          System.out.println(h_set);
	}

}
