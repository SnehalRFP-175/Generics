/*
 * Refactor 2 -  Generic class to find the maximum value of Integer, Float, String
 */

package com.Generics.BridgeLabz;
/**
* @author -Snehal Nanavare.
*/

//GenericCclass
public class MaxValue<T extends Comparable<T>> 
{

	T num1, num2, num3;

	public MaxValue(T num1, T num2, T num3) 
	{
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
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