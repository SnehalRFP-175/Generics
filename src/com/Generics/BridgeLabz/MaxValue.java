/*
 * Refactor 1 - One Generic method to find the maximum value of Integer, Float, String
 */

package com.Generics.BridgeLabz;
/**
* @author -Snehal Nanavare.
*/
public class MaxValue {

	/*
	 *Generic method for finding  maximum value of any type of data.
	 */
	public static <T extends Comparable<T>> T maxOfValues(T num1, T num2, T num3) {
		T max = num1;		
		if (num2.compareTo(max) > 0)
		max = num2;
		if (num3.compareTo(max) > 0)
		max = num3;
		return max;
	}

	
public static void main(String a[]) 
{
	System.out.println("Integer Maximum Value : " + maxOfValues( 6, 5, 9 ));
	System.out.println("Float Maximum Value : " + maxOfValues( 6.5f, 5.9f, 9.15f ));
	System.out.println("String Maximum Value : " + maxOfValues( "pqr","efg", "stu" ));
}
}