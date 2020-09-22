package com.functionalprogramming.stream;

import com.functionalprogramming.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.functionalprogramming.Gender;

public class _Stream {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("ALI" , Gender.MALE),
				new Person("HAFSA" , Gender.FEMALE),
				new Person("KASHIF" , Gender.MALE),
				new Person("UZAM" , Gender.FEMALE)
				);
		people.stream()
		.map(person -> person.getGender())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		people.stream()
		.map(person -> person.toString())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		people.stream()
		.map(person -> person.getGender())
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		
		people.stream()
		.map(person -> person.getPersonName())
		.mapToInt(String::length)
		.forEach(System.out::println);
		
	}

}
