package com.djy.citi.exercise;

import com.djy.citi.algorithm.FirstLastList;

/**
 * @author : Alvin Du
 * date    : 2012-8-10
 */
public class FirstLastListApp {

	/**
	 * author : 杜超
	 * date   : 2012-8-10
	 *
	 */
	public static void main(String[] args) {

		FirstLastList firstLastList = new FirstLastList();
		
		firstLastList.insertFirst(11);
		firstLastList.insertFirst(22);
		firstLastList.insertFirst(33);
		firstLastList.insertFirst(44);
		firstLastList.insertFirst(55);
		
		firstLastList.deleteFirst();
		firstLastList.deleteFirst();
		firstLastList.deleteFirst();
		firstLastList.deleteFirst();
		firstLastList.deleteFirst();
		
		firstLastList.displayList();
		
		//insert last 
		firstLastList.insertLast(66);
		firstLastList.insertLast(77);
		firstLastList.insertLast(88);
		firstLastList.insertLast(99);
		
		firstLastList.displayList();
		
		firstLastList.deleteLast();
		
		firstLastList.displayList();

	}

}

