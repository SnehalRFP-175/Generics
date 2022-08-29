/*
 * UC2 - Finding the maximum value of Float
 */

package com.Generics.BridgeLabz;
/**
* @author -Snehal Nanavare 
*/
public class MaxValue {

/**
* Method to find the maximum value of Integer
*/

	public static Integer maxOfInteger(Integer n1, Integer n2, Integer n3)
	{
	Integer intMax = n1;
	if (n2.compareTo(intMax) > 0)
		intMax = n2;
	if (n3.compareTo(intMax) > 0)
		intMax = n3;
	return intMax;
	}
	
/**
* Method to find the maximum value of Float
*/
	public static Float maxOfFloat(Float f1, Float f2, Float f3) 
	{
		Float floatMax = f1;
		if (f2.compareTo(floatMax) > 0)
			floatMax = f2;
		
		if (f3.compareTo(floatMax) > 0)
			floatMax = f3;
		
		return floatMax;
		}


public static void main(String[] args) {
System.out.println("Integer Maximum Value : " + maxOfInteger( 6, 5, 9 ));
System.out.println("Float Maximum Value : " + maxOfFloat( 6.5f, 5.9f, 9.15f ));
}
}