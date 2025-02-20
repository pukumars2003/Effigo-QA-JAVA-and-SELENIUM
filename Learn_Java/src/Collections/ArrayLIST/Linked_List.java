package Collections.ArrayLIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		
		a.add("Hello");
		a.add(100);
		
		System.out.println(a);
		for(Object e:a) {
			System.out.println(e);
		}
		
		Iterator it=a.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		a.add(1, "OK");
		System.out.println(a);
		
		a.addFirst("Hello");
		a.addLast("Not Ok");
		System.out.println(a);
		
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		
		for(int i=0;i<a.size();i++) {
			System.out.println("Index : "+i+" Value : "+a.get(i));
		}
		List d=new ArrayList(a);
		
		System.out.println(d);
	}

}
