package com.webdevelopment.ModuleFour;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webdevelopment.ModuleFive.EventCategory;

public interface EventCategoryRepository extends JpaRepository<EventCategory, Integer> {

}
