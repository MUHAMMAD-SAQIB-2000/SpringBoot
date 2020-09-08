package com.amogoscode;

import java.util.List;

import com.amogoscode.entity.Person;
import com.amogoscode.entity.PersonData;

public class AmigosCodeMainClass {

	public static void main(String[] args) {
		List<Person> people = PersonData.getAll();
		people.forEach(System.out::println);

		PersonData.streamsFilter();
		PersonData.streamsSort();
		PersonData.streamsSortFilter();
		PersonData.allMatch();
		PersonData.anyMatch();
		PersonData.noneMatch();
		PersonData.streamsMax();
		PersonData.streamsMin();
		PersonData.streamsGroup();
		PersonData.streamsFilterMaxMap();
	}

}
