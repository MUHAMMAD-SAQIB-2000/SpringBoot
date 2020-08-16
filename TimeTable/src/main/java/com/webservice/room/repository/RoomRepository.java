package com.webservice.room.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.room.entity.Room;

public interface RoomRepository extends JpaRepository<Room,Integer>{

}
