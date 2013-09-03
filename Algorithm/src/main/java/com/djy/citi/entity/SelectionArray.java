package com.djy.citi.entity;
/**
 * @author : Alvin Du
 * date    : 2012-8-5
 */
public class SelectionArray {
	
	private double[] array;
	private int nElems;
	
	//constructor
	public SelectionArray(int length) {
		array = new double[length];
		nElems = 0;
	}
	
	//insert data method
	public void insert(double elem){
		array[nElems] = elem;
		nElems++;
	}
	
	/**
	 * 
	 * author : 杜超
	 * date   : 2012-8-5
	 * select the minimum elem and put in the left side,
	 *
	 */
	public void sort(){
		for(int i=0;i<nElems;i++){
			int min=i;
			for(int j=i+1;j<nElems;j++){
				if(array[j]<array[min]){
					min = j;
				}
			}
			
			if(min!=i){
				double temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}
		}
		
	}
	
	public void display() {
		for(int i=0;i<nElems;i++){
			System.out.print(array[i]+" ");
		}
	}
	
	

}

