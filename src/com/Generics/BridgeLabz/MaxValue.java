/*
 * UC1 - Finding the maximum value of Integer
 */

package com.Generics.BridgeLabz;
/**
* @author -Snehal Nanavare 
*/
public class MaxValue {

/**
* Method to find the maximum value of Integer
*/

	public static Integer maxOfInteger(Integer n1, Integer n2, Integer n3){
	Integer max = n1;
	if (n2.compareTo(max) > 0)
		max = n2;
	if (n3.compareTo(max) > 0)
		max = n3;
	return max;
	}


public static void main(String[] args) {
System.out.println("Maximum Value : " + maxOfInteger( 6, 5, 9 )+ "\n");
}
}