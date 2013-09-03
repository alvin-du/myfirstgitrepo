package com.djy.citi.exercise;

import com.djy.citi.entity.InsertionArray;

/**
 * @author : Alvin Du
 * date    : 2012-8-5
 */
public class InsertionSort {

	/**
	 * author : 杜超
	 * date   : 2012-8-5
	 *
	 */
	public static void main(String[] args) {

		InsertionArray insertionArray = new InsertionArray(100);
		
		//insertin data into insertionArray
		//insertting data into insertionArray
		insertionArray.insert(7);
		insertionArray.insert(11);
		insertionArray.insert(22);
		insertionArray.insert(33);
		insertionArray.insert(44);
		insertionArray.insert(55);
		insertionArray.insert(66);
		insertionArray.insert(77);
		insertionArray.insert(88);
		insertionArray.insert(99);
		insertionArray.insert(90);
		insertionArray.insert(80);
		insertionArray.insert(70);
		insertionArray.insert(60);
		insertionArray.insert(50);
		insertionArray.insert(40);
		insertionArray.insert(30);
		insertionArray.insert(20);
		insertionArray.insert(1);
		
		//call sort method
		insertionArray.sort();
		
		//call display method to print elements
		insertionArray.display();
	}

}

