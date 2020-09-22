package com.functionalprogramming.supplier;

import java.util.function.Supplier;

public class _Supplier {
	
	public static void main(String[] args) {
		System.out.println(getSupplier.get());
	}
	static Supplier<String> getSupplier = () ->			
		("hello");
}
