package com.djy.citi.exercise;

import com.djy.citi.algorithm.LinkStack;

/**
 * @author : Alvin Du
 * date    : 2012-8-11
 */
public class LinkStackApp {

	/**
	 * author : 杜超
	 * date   : 2012-8-11
	 *
	 */
	public static void main(String[] args) {
		
		LinkStack linkStack = new LinkStack();
		
		linkStack.push(55);
		linkStack.push(44);
		linkStack.push(33);
		linkStack.push(22);
		linkStack.push(11);
		
		linkStack.displayStack();
		
		int data = linkStack.pop();
		
		System.out.println("deleted:"+data);
		
		linkStack.displayStack();
		
		linkStack.pop();
		linkStack.pop();
		linkStack.pop();
		linkStack.pop();
		linkStack.pop();
		
		linkStack.displayStack();

	}

}

