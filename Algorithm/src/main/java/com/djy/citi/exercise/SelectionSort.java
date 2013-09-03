package com.djy.citi.exercise;

import com.djy.citi.entity.SelectionArray;

/**
 * @author : Alvin Du
 * date    : 2012-8-5
 */
public class SelectionSort {

	/**
	 * author : 杜超
	 * date   : 2012-8-5
	 *
	 */
	public static void main(String[] args) {
		
		//construct object selectionArray
		SelectionArray selectionArray = new SelectionArray(100);
		
		//insertting data into selectionArray
		selectionArray.insert(7);
		selectionArray.insert(11);
		selectionArray.insert(22);
		selectionArray.insert(33);
		selectionArray.insert(44);
		selectionArray.insert(55);
		selectionArray.insert(66);
		selectionArray.insert(77);
		selectionArray.insert(88);
		selectionArray.insert(99);
		selectionArray.insert(90);
		selectionArray.insert(80);
		selectionArray.insert(70);
		selectionArray.insert(60);
		selectionArray.insert(50);
		selectionArray.insert(40);
		selectionArray.insert(30);
		selectionArray.insert(20);
		selectionArray.insert(1);
		
		//call sort method to sort data in selectionArray;
		selectionArray.sort();
		
		//call display method to print data in selectionArray
		selectionArray.display();
	}

}

