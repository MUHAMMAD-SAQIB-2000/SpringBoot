package com.functionalprogramming.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		System.out.println(isPhoneNumberValid("09009009009"));
		System.out.println(isPhoneNumberValid("0900900900"));
		System.out.println(isPhoneNumberValidPredicate.test("09009009009"));
		System.out.println(isPhoneNumberValidPredicate.and(containsNumber9).test("09090090090"));
		System.out.println(containsNumber9.test("9009009009"));
		
	}

	private static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("09") && phoneNumber.length()==11;
	}

	static Predicate<String> isPhoneNumberValidPredicate = 
			phoneNumber -> phoneNumber.startsWith("09") && phoneNumber.length()==11;

	static Predicate<String> containsNumber9 = 
		phoneNumber -> phoneNumber.contains("9");
	
}

