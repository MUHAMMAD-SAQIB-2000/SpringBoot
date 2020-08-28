package com.webdevelopment.ModuleFour;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdevelopment.ModuleTwo.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

}
