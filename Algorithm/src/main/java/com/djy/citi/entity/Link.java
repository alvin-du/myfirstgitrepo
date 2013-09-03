package com.djy.citi.entity;
/**
 * @author : Alvin Du
 * date    : 2012-8-10
 */
public class Link {
	
	private int data;
	private Link next;

	//constructor
	public Link(int data) {
		this.data = data;
		next = null;
	}

	public void display(){
		System.out.println("data:"+data);
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

}

