package listEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
//		List l = new ArrayList();
		
//		alist.add("String");
//		alist.add(0.256);
//		alist.add(10);
//		alist.add("St");
//		alist.add(true);
		
		alist.add(255);
		alist.add(256);
		alist.add(10);
		alist.add(10);
		alist.add(50);
		
		System.out.println(alist);
		
		//remove individual index wise
		alist.remove(0);
		
		Collections.sort(alist);
		
		System.out.println(alist);
		//for each example
		for(Integer x : alist) {
			System.out.println(x+500);
			System.out.println(x-500);
		}
		
		
		
		//for loop
		int size = alist.size();
		for(int i=0 ; i < size ; i++) {
			System.out.println(alist.get(i));
		}
		//Iterator
		Iterator<Integer> itr = alist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(50);
//		al.add(55);
		//contains all
		boolean b = al.containsAll(alist);
		System.out.println(b);
		//remove all
		alist.removeAll(alist);
		
		System.out.println(alist);
		
		
	
	}
}
