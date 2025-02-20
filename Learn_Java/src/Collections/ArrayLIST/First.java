package Collections.ArrayLIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class First {

	public static void main(String[] args) {
		List<String> colors=new ArrayList<String>();
		
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		
		System.out.println(colors);
        colors.add(4, "White");
        colors.add(5, "Black");
        colors.add(6, null);
        System.out.println(colors);
        
        System.out.println(colors.get(4));
        colors.set(4, "Violet");
        
        System.out.println(colors);
        
        colors.remove(6);
        Collections.sort(colors);
        System.out.println(colors);
        
        List<String> b=new ArrayList<String>();
        b.add("Yellow");
		b.add("Red");
		b.add("Green");
		b.add("Blue");
		
        /*Collections.copy(colors,b);
        //Collections.shuffle(colors);
        
        Collections.reverse(colors);
        
        System.out.println(colors);
        
        List l=colors.subList(0,2);
        System.out.println(l);
        //System.out.println(colors);
        
        List<String> c=new ArrayList<String>();
        for(String a:colors) {
        	c.add(b.contains(a)? "Yes" : "No" );
        }
        System.out.println(c);
        
        
        Iterator it=colors.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
        Collections.swap(b, 1, 2);
        System.out.println(b);
        
        //addAll used to join two list*/
        
        colors.clear();
        System.out.println(colors);
	}

}
