/*
 * UC3 - Finding the maximum value of String
 */

package com.Generics.BridgeLabz;
/**
* @author -Snehal Nanavare 
*/
public class MaxValue {

/**
*  Method to compare three Integers and get the maximum value.
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
*  Method to compare three Floats and get the maximum value.
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

/**
* Method to compare three strings and get the maximum value.
*/
	public static String maxOfString(String s1, String s2, String s3) 
	{
		String max = s1;
		if (s2.compareTo(max) > 0)
		max = s2;
		if (s3.compareTo(max) > 0)
		max = s3;
		return max;
	}

	
public static void main(String[] args) {
System.out.println("Integer Maximum Value : " + maxOfInteger( 6, 5, 9 ));
System.out.println("Float Maximum Value : " + maxOfFloat( 6.5f, 5.9f, 9.15f ));
System.out.println("String Maximum Value : " + maxOfString( "pqr","efg", "stu" ));
}
}