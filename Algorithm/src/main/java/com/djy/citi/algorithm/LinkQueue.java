package com.djy.citi.algorithm;



/**
 * @author : Alvin Du
 * date    : 2012-8-11
 */
public class LinkQueue {
	
	private FirstLastList firstLastList ;
	
	//constructor
	public LinkQueue(){
		firstLastList = new FirstLastList();
	}
	
	//insert
	public void insert(int data){
		firstLastList.insertLast(data);
	}
	
	//remove
	public int remove(){
		int data = firstLastList.deleteFirst();
		return data;
	}
	
	//display link queue
	public void display(){
		System.out.println("display link Queue:");
		firstLastList.displayList();
	}

}

