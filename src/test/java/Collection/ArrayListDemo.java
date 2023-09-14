package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();   //Generics
		
		l.add("Akash");
		l.add(10);
		l.add('c');
		
		System.out.println(l);  /// printing all values
		System.out.println(l.size()); // size of the Arraylist
		
		
		//allows duplicate values
		
		l.add("Akash");
		l.add(10);
		System.out.println(l);
		
		//remove items
		System.out.println(l.remove(2));
		
		//Fetch particular values
		
		System.out.println(l.get(3));  //Starts with zero index
		
		//for fetching and iterating all values we can use 1.For Loop 2.For Each loop 3.Iterator
		
		//1.For Loop
		
		for(int i=0;i<l.size();i++) {
			
			System.out.println(l.get(i));
			
		}
		
		//For Each loop
		
		for (Object object : l) {
			System.out.println(object);
		}
		
		
		//3.Iterator
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
