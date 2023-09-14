package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class List_Demo {
	
	public static void main(String[] args) {
		
		HashSet<Integer> h= new HashSet<Integer>();   //Duplicates not allowed in Set , We cannot use get method in Set beacuase of that we cannot use for loop
		h.add(10);
		h.add(20);
		h.add(40);
		h.add(30);
		h.add(30);
		
		System.out.println(h);   
		h.remove(10);
		System.out.println(h);
		
		//Iterate all values
		
		//  1.for loop
		
//		for(int i=0;i<h.size();i++) {
//			
//			System.out.println(h.ge);
//			
//		}
		
		//2.ForEach Loop
		
		for(Object obj:h)
		{
			System.out.println(obj);
			
		}
		
		//Iterator
		
		Iterator itr =h.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		
		
		
		
	}
	

}
