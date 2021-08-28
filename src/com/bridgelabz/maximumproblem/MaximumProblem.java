package com.bridgelabz.maximumproblem;

public class MaximumProblem {


	
	public static void maxOfThreeNumbers(Integer one, Integer two, Integer three) {
		
		Integer maxOfTwo=(one.compareTo(two)>0?one:two);
		Integer maxInteger=(one.compareTo(three)>0?one:three);
		System.out.println("Maximum of three integers are:"+maxInteger);
	}
	
public static void main(String[] args) {
		
		Integer firstNumber=5;
		Integer secondNumber=10;
		Integer thirdNumber=15;
		
		maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);

	}

}
