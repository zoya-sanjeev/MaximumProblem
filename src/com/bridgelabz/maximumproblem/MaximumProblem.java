package com.bridgelabz.maximumproblem;

public class MaximumProblem {


	
	public static void findMaxOfThree(Integer one, Integer two, Integer three) {
		
		Integer maxOfTwo=(one.compareTo(two)>0?one:two);
		Integer maxInteger=(maxOfTwo.compareTo(three)>0?maxOfTwo:three);
		System.out.println("Maximum of three integers are:"+maxInteger);
	}
	
	public static void findMaxOfThree(Float one, Float two, Float three) {
		
		Float maxOfTwo=(one.compareTo(two)>0?one:two);
		Float maxFloat=(maxOfTwo.compareTo(three)>0?maxOfTwo:three);
		System.out.println("Maximum of three floats are:"+maxFloat);
	}
	
	public static void findMaxOfThree(String one, String two, String three) {
		
		String maxOfTwo=(one.compareTo(two)>0?one:two);
		String maxString=(maxOfTwo.compareTo(three)>0?maxOfTwo:three);
		System.out.println("Maximum of three strings are:"+maxString);
	}
	
	public static void main(String[] args) {
		
		Integer firstInteger=5;
		Integer secondInteger=10;
		Integer thirdInteger=15;
		
		findMaxOfThree(firstInteger,secondInteger,thirdInteger);
		
		Float firstFloat=1.38f;
		Float secondFloat=1.40f;
		Float thirdFloat=1.39f;
		
		findMaxOfThree(secondFloat, secondFloat, thirdFloat);
		
		String firstString="apple";
		String secondString="peach";
		String thirdString="banana";
		
		findMaxOfThree(firstString, secondString, thirdString);
		

	}

}
