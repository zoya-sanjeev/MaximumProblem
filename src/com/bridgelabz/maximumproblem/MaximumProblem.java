package com.bridgelabz.maximumproblem;

public class MaximumProblem {


	
	public static <E extends Comparable <E>> void findMaxOfThree(E one, E two, E three) {
		
		E maxOfTwo=(one.compareTo(two)>0?one:two);
		E max=(maxOfTwo.compareTo(three)>0?maxOfTwo:three);
		System.out.println("Maximum of three integers are:"+max);
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
