package com.functionalprogramming.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	
	public static void main(String[] args) {
		//Function
		System.out.println("\n-> Function ");
		int increment = incrementByOne(1);
		System.out.println(increment);
		int increment1 = incrementByOneFunction.apply(1);
		System.out.println(increment1);
		
		//Chaining Function
		System.out.println("\n-> Chaining Function ");
		int multiply = multiplyBy10Function.apply(20);
		System.out.println(multiply);
		int addAndMul = addByOneMultiplyBy10Function.apply(30);
		System.out.println(addAndMul);
		
		//BIFunction
		System.out.println("\n-> BIFunction ");
		System.out.println(add1Mul10.apply(20, 10));
	}
	//Function
	static Function<Integer, Integer> incrementByOneFunction = number -> number+1; 
	
	static int incrementByOne(int number) {
		return number+1;
	}
	
	//Chaining funtion
	static Function<Integer , Integer> multiplyBy10Function = number -> number*10;
	
	static Function<Integer , Integer> addByOneMultiplyBy10Function  =
			incrementByOneFunction.andThen(multiplyBy10Function);
	
	//BIFunction
	static BiFunction<Integer, Integer, Integer> add1Mul10 = 
			(number1 , mul10) -> (number1+1) * mul10;
}
