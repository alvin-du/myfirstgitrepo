package com.djy.citi.exercise;

import com.djy.citi.entity.BubbleArray;
import com.djy.citi.entity.InsertionArray;
import com.djy.citi.entity.SelectionArray;

/**
 * @author : Alvin Du
 * date    : 2012-8-5
 */
public class Main {

	/**
	 * author : 杜超
	 * date   : 2012-8-5
	 *
	 */
	public static void main(String[] args) {
		
		BubbleArray bubbleArray = new BubbleArray(10000);
		InsertionArray insertionArray = new InsertionArray(10000);
		SelectionArray selectionArray = new SelectionArray(10000);
		
		for(int i=0;i<8000;i++){
			bubbleArray.insert(Math.random()*100);
		}
		
		for(int i=0;i<8000;i++){
			insertionArray.insert(Math.random()*100);
		}
		
		for(int i=0;i<8000;i++){
			selectionArray.insert(Math.random()*100);
		}
		
		System.out.println("bubble sort start");
		long bubbleBegin = System.currentTimeMillis();
		bubbleArray.sort();
		long bubbleEnd = System.currentTimeMillis();
		System.out.println("bubble sort end and total time is:"+(bubbleEnd-bubbleBegin));
		
		System.out.println("Insertion sort start");
		long insertionBegin = System.currentTimeMillis();
		bubbleArray.sort();
		long insertionEnd = System.currentTimeMillis();
		System.out.println("Insertion sort end and total time is:"+(insertionEnd-insertionBegin));
		
		System.out.println("selection sort start");
		long selectionBegin = System.currentTimeMillis();
		bubbleArray.sort();
		long selectionEnd = System.currentTimeMillis();
		System.out.println("selection sort end and total time is:"+(selectionEnd-selectionBegin));
		
	}

}

