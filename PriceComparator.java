package com.greatLearning.assignment;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		Book b1 = o1;
		Book b2 = o2;
		if(b1.price==b2.price)
			return 0;
		else if(b1.price>b2.price)
			return 1;
		else
		return -1;
	}

}
