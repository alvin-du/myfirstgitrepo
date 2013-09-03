package com.djy.citi.exercise;


import com.djy.citi.entity.BubbleArray;

/**
 * @author : Alvin Du
 * date    : 2012-8-5
 */
public class BubbleSort {

	/**
	 * author : 杜超
	 * date   : 2012-8-5
	 *
	 */
	public static void main(String[] args) {
		// construct object bubbleArray
		BubbleArray bubbleArray = new BubbleArray(100);
		
		//inserting data into bubbleArray
		bubbleArray.insert(7);
		bubbleArray.insert(11);
		bubbleArray.insert(22);
		bubbleArray.insert(33);
		bubbleArray.insert(44);
		bubbleArray.insert(55);
		bubbleArray.insert(66);
		bubbleArray.insert(77);
		bubbleArray.insert(88);
		bubbleArray.insert(99);
		bubbleArray.insert(90);
		bubbleArray.insert(80);
		bubbleArray.insert(70);
		bubbleArray.insert(60);
		bubbleArray.insert(50);
		bubbleArray.insert(40);
		bubbleArray.insert(30);
		bubbleArray.insert(20);
		bubbleArray.insert(1);
		
		//call bubble sort method
		bubbleArray.sort();
		
		//call display method to print bubbleArray
		bubbleArray.display();

	}

}

