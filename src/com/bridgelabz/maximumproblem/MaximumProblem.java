package com.bridgelabz.maximumproblem;

public class MaximumProblem {


	
	public static void findMaxOfThree(Integer one, Integer two, Integer three) {
		
		Integer maxOfTwo=(one.compareTo(two)>0?one:two);
		Integer maxInteger=(one.compareTo(three)>0?one:three);
		System.out.println("Maximum of three integers are:"+maxInteger);
	}
	
	public static void findMaxOfThree(Float one, Float two, Float three) {
		
		Float maxOfTwo=(one.compareTo(two)>0?one:two);
		Float maxFloat=(one.compareTo(three)>0?one:three);
		System.out.println("Maximum of three integers are:"+maxFloat);
	}
	
	public static void main(String[] args) {
		
		Integer firstInteger=5;
		Integer secondInteger=10;
		Integer thirdInteger=15;
		
		findMaxOfThree(firstInteger,secondInteger,thirdInteger);
		
		Float firstFloat=1.38f;
		Float secondFloat=1.33f;
		Float thirdFloat=1.39f;
		
		findMaxOfThree(secondFloat, secondFloat, thirdFloat);
		

	}

}
