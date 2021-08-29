package com.bridgelabz.maximumproblem;

public class MaximumProblem<E extends Comparable<E>> {

	E firstValue;
	E secondValue;
	E thirdValue;
	
	MaximumProblem(E first,E second,E third){
		this.firstValue=first;
		this.secondValue=second;
		this.thirdValue=third;
	}
	
	public void findMaxOfThree() {
		
		E maxOfTwo=(firstValue.compareTo(secondValue)>0?firstValue:secondValue);
		E max=(maxOfTwo.compareTo(thirdValue)>0?maxOfTwo:thirdValue);
		System.out.println(max);
	}
	

	public static void main(String[] args) {
		
		
		
		Integer firstInteger=5;
		Integer secondInteger=10;
		Integer thirdInteger=15;
		
		new MaximumProblem<Integer>(firstInteger, secondInteger, thirdInteger).findMaxOfThree();
		
		Float firstFloat=1.38f;
		Float secondFloat=1.40f;
		Float thirdFloat=1.39f;
		
		new MaximumProblem<Float>(firstFloat, secondFloat, thirdFloat).findMaxOfThree();
		
		String firstString="apple";
		String secondString="peach";
		String thirdString="banana";
		
		new MaximumProblem<String>(firstString, secondString, thirdString).findMaxOfThree();
		

	}

}
