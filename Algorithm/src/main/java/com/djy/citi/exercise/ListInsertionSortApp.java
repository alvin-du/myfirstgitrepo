package com.djy.citi.exercise;

import com.djy.citi.algorithm.SortedList;
import com.djy.citi.entity.Link;

/**
 * @author : Alvin Du
 * date    : 2012-8-11
 */
public class ListInsertionSortApp {

	/**
	 * author : 杜超
	 * date   : 2012-8-11
	 *
	 */
	public static void main(String[] args) {
		Link[] linkArray = new Link[10];
		
		for(int i=0;i<linkArray.length;i++){
			Link newLink = new Link((int)(Math.random()*100));
			linkArray[i]=newLink;
		}
		
		System.out.println("before sort:");
		
		for (int i = 0; i < linkArray.length; i++) {
			linkArray[i].display();
		}
		
		SortedList sortedList = new SortedList(linkArray);
		
		for(int i=0; i<linkArray.length;i++){
			linkArray[i].setData(sortedList.remove());
		}
		
		System.out.println("after sort:");
		
		for (int i = 0; i < linkArray.length; i++) {
			linkArray[i].display();
		}
	}

}

