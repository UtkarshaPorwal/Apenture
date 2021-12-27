package com.greatLearning.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Collections;

class Blass<T>
{
	T obj; //type object 
	void add(T obj) {
		this.obj=obj;
	}
 T get(){
		return  obj;
	}
}
public class MagicOfBooks {
	
	public static void main(String[] args) {
		
		 ArrayList<Book> bookdata = new ArrayList<Book>();
		 bookdata.add(new Book("Advance Java ", 500, 2, 10));
		 bookdata.add(new Book("Core Java ", 400, 3, 11));
		 bookdata.add(new Book("Oracle ", 700, 2, 5));
		 bookdata.add(new Book("C++", 400, 2, 10));
		 bookdata.add(new Book("HTML ", 300, 2, 9)); 
		
		System.out.println("For adding book press 1");
		System.out.println("For deletting book press 2");
		System.out.println("For updating book press 3");
		System.out.println("For displaying book press 4");
		System.out.println("For total count of book press 5");
		System.out.println("For seeing all book under autobiography genre book press 6");
		System.out.println("For arranging book press 7");
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(111, "Advance java");
		map.put(222, "Core java");
		map.put(333, "Oracle");
		map.put(444, "C++");
		map.put(555, "HTML");
		map.put(666, "DBMS");
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
    int no = a;

	
    int key ;
   String value;
    if(no>0) {

		switch(no) {
		
		case 1:System.out.println("Enter key and value for adding book");
		 key = s.nextInt();
		       value = s.next();
		map.put(key, value);
		
		break;
		case 2: System.out.println("Enter key value for deletting book");
		key = s.nextInt();
		map.remove(key);
		break;
		case 3:System.out.println("Enter key and value for Updating book");
	       for(Integer k:map.keySet()) {
	    	   System.out.println("Present keys are: "+k);
	       }
	       key = s.nextInt();
	       value = s.next();
	       map.replace(key, value);
		case 4:System.out.println(map);
		break;
		case 5:System.out.println(map.size());
		break;
		case 6:System.out.println("I can see all detail under autography genre");
			break;
		case 7:
			System.out.println("Books are available low to high price");
			Collections.sort(bookdata,new PriceComparator());
			Iterator it = bookdata.iterator();
			while(it.hasNext()) {
				Book b = (Book) it.next();
				System.out.println("Book name: "+b.name+ "price: "+b.price);
			}
			System.out.println();
			
			System.out.println("Books are available high to low price");
			Collections.sort(bookdata,new PriceCompare());
			Iterator itr = bookdata.iterator();
			while(itr.hasNext()) {
				Book b = (Book) itr.next();
				System.out.println("Book name: "+b.name+ "price: "+b.price);
			}
		 Blass<String> m1 = new Blass<String>();
	     m1.add("Core java");
	     
	     System.out.println(" Best selling book is "+ m1.get());
		break;
		
	}
   }
   else {
	throw new NumberNotAvailableException("Number is invalid");
}

}
}
