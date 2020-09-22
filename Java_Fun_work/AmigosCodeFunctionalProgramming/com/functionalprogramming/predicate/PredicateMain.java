package com.functionalprogramming.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.functionalprogramming.Gender;
import com.functionalprogramming.Person;

public class PredicateMain {
	
	static List<Person> people = getPerson();
	public static void main(String[] args) {
		
		System.out.println("Entities in list");
		people.forEach(System.out::println);
		
		System.out.println("\n-> Imperitive Approach \n");
		imperitiveAppraoch();
		
		System.out.println("\n-> Decalraitive Approach \n");
		declarativeApproach();
		
		System.out.println("\n-> Perdicate Decalraitive Approach \n");
		perdicateDeclarativeApproach();
		
		
	}
	
	private static void imperitiveAppraoch() {
		List<Person> females = new ArrayList<>();
		for(Person person : people) {
			if(Gender.FEMALE.equals(person.getGender())) {
				females.add(person);
			}
		}
		for(Person female : females) {
			System.out.println(female);
		}
	}
	
	private static void declarativeApproach() {
		people.stream()
		.filter(person -> Gender.FEMALE.equals(person.getGender()))
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
	
	private static void perdicateDeclarativeApproach() {
		Predicate<Person> personPredicate = person -> Gender.MALE.equals(person.getGender());
		
		List<Person> males = people.stream()
			.filter(personPredicate)
			.collect(Collectors.toList());
			
		males.forEach(System.out::println);	
	}
	
	
	public static List<Person> getPerson(){
		return Arrays.asList(
				new Person("Ali" , Gender.MALE),
				new Person("Ayesha" , Gender.FEMALE),
				new Person("Usman" , Gender.MALE),
				new Person("Hashim" , Gender.MALE),
				new Person("Alia" , Gender.FEMALE)
				);
	}
}
