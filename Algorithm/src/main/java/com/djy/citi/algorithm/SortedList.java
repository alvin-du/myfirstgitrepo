package com.djy.citi.algorithm;

import com.djy.citi.entity.Link;

/**
 * @author : Alvin Du
 * date    : 2012-8-11
 */
public class SortedList {
	
	private Link first;
	
	//constructor
	public SortedList(){
		first = null;
	}
	
	//construcor
	public SortedList(Link[] linkArray){
		for(int count=0;count<linkArray.length;count++){
			insert(linkArray[count].getData());
		}
	}
	
	//is empty
	public boolean isEmpty(){
		return (first==null);
	}
	
	//insert
	public void insert(int data){
		Link newLink = new Link(data);
		Link current = first;
		Link previous = null;
		
		while(current!=null&&data>current.getData()){
			previous = current;
			current = current.getNext();
		}
		
		if(previous==null){
			first = newLink;
//		}else if(current==null){
//			previous.setNext(newLink);
		}else {
			previous.setNext(newLink);
		}
		newLink.setNext(current);
	}
	
	//remove
	public int remove(){
		Link temp = first;
		first = first.getNext();
		return temp.getData();
	}
	
	//display sorted link
	public void display(){
		System.out.println("display sorted link:");
		Link current = first ;
		while(current!=null){
			current.display();
			current = current.getNext();
		}
	}

}

