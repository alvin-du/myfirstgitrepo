package com.djy.citi.entity;
/**
 * @author : Alvin Du
 * date    : 2012-8-5
 */
public class BubbleArray {
	
	private double[] array;
	private int nElems;
	
	//constructor
	public BubbleArray(int length) {
		array = new double[length];
		nElems = 0;
	}
	
	public void insert(double elem){
		array[nElems] = elem;
		nElems++;
	}
	
	//put the max elem to the right hand
	public void sort(){
		for(int i=0;i<nElems;i++){
			for(int j=0;j<i;j++){
				if(array[j]>array[j+1]){
					double temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	//print elems in array
	public void display(){
		for(int i=0;i<nElems;i++){
			System.out.print(array[i]+" ");
		}
	}
}

