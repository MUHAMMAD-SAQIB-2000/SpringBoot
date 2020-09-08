package com.amogoscode.entity;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonData {

	static List<Person> people = getPeople();

	private static List<Person> getPeople(){
		return Arrays.asList(
				new Person(20 , "Saqib" , Gender.MALE),
				new Person(20 , "Arooj" , Gender.FEMALE),
				new Person(21 , "Maida" , Gender.FEMALE),
				new Person(21 , "Umair" , Gender.MALE),
				new Person(7 , "Romaila" , Gender.FEMALE)
				);
	}

	public static List<Person> getAll(){
		return people;
	}
	
	//Streams-Filter
	public static void streamsFilter() {
		System.out.println("\nStreams-Filter Filters the records with the given gender");
		List<Person> females =  people.stream()
				.filter(person -> person.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());
		females.forEach(System.out::println);
	}

	//Streams-Sort
	public static void streamsSort() {
		System.out.println("\nStreams-Sort sorts the records with age in assending order");
		List<Person> sorted =  people.stream()
				.sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList());
		sorted.forEach(System.out::println);
	}

	//Streams-Sort-Filter
	public static void streamsSortFilter() {
		System.out.println("\nStreams-SortFilter sorts the records with age and filters through gender");
		List<Person> sortedFilter =  people.stream()
				.filter(person -> person.getGender().equals(Gender.MALE))
				.sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList());
		sortedFilter.forEach(System.out::println);
	}

	//Streams-AllMatch
	public static void allMatch() {
		System.out.println("\nStreams-AllMatch display true if all match the condition");
		boolean allMatch = people.stream()
				.allMatch(person -> person.getAge() > 8);
		System.out.println(allMatch);
	}

	//Streams-AnyMatch
	public static void anyMatch() {
		System.out.println("\nStreams-AnyMatch display true if any match the condition");
		boolean anyMatch = people.stream()
				.anyMatch(person -> person.getAge() > 8);
		System.out.println(anyMatch);
	}

	//Streams-noneMatch
	public static void noneMatch() {
		System.out.println("\nStreams-NoneMatch display true if there is none that matches the condition");
		boolean noneMatch = people.stream()
				.noneMatch(person -> person.getName().equals("Ali"));
		System.out.println(noneMatch);
	}

	//Streams-Max
	public static void streamsMax() {
		System.out.println("\nStreams-Max display The maximum value");
		people.stream()
		.max(Comparator.comparing(Person::getAge))
		.ifPresent(System.out::println);
	}

	//Streams-Min
	public static void streamsMin() {
		System.out.println("\nStreams-Min display The minimum value");
		people.stream()
		.min(Comparator.comparing(Person::getAge))
		.ifPresent(System.out::println);
	}

	//Streams-Group
	public static void streamsGroup() {
		System.out.println("\nStreams-Group displays grouped Data");
		Map<Gender , List<Person>> groupByGender = people.stream()
				.collect(Collectors.groupingBy(Person::getGender));
		groupByGender.forEach((gender , peopleGender) ->{
			System.out.println(gender);
			peopleGender.forEach(System.out::println);
			System.out.println();
		});
	}

	//Streams-FilterMaxMap
	public static void streamsFilterMaxMap() {
		System.out.println("\nStreams-Multi");
		Optional<String> oldest = people.stream()
				.filter(person -> person.getGender().equals(Gender.FEMALE))
				.max(Comparator.comparing(Person::getAge))
				.map(Person::getName);
		oldest.ifPresent(System.out::println);
	}
}
