package com.djy.citi.utils;
/**
 * @author : Alvin Du
 * date    : 2013-9-1
 */
public class Utils {
	/**
	 * 斐波那契数列指的是这样一个数列：1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
	 * 如果设F(n）为该数列的第n项（n∈N+）。那么这句话可以写成如下形式：
	 *	F_0=0,F_1=1,F_n=F_{n-1}+F_{n-2} (n>=2)
	 */
	public static Long getFibonacci(Integer number) {
		Long result = null;
		if(number==1||number==2){
			result =1l;
		}else{
			result = getFibonacci(number-1)+getFibonacci(number-2);
		}
		return result;
	}
	
	/**
	 * 
	 *判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
	 *
	 */
	public static Boolean isPrime(Integer number){
		Boolean result = true;
		for(int i=2;i<=Math.sqrt(number);i++){
			if(number%i==0){
				result = false;
				break;
			}
		}
		return result;
	}
}

