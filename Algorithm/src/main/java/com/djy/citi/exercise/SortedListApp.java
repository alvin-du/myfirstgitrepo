package com.djy.citi.exercise;

import com.djy.citi.algorithm.SortedList;

/**
 * @author : Alvin Du
 * date    : 2012-8-11
 */
public class SortedListApp {

	/**
	 * author : 杜超
	 * date   : 2012-8-11
	 *
	 */
	public static void main(String[] args) {

		SortedList sortedList = new SortedList();
		
		sortedList.insert(11);
		sortedList.insert(22);
		sortedList.insert(33);
		sortedList.insert(55);
		sortedList.insert(44);
		
		sortedList.display();
		
		sortedList.remove();
		
		sortedList.display();
		
		sortedList.insert(99);
		sortedList.insert(36);
		sortedList.insert(88);
		sortedList.insert(56);
		sortedList.insert(66);
		
		sortedList.display();
		
	}

}

