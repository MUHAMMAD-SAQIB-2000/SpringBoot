package com.webservice.room.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.room.repository.RoomRepository;
import com.webservice.room.entity.Room;

@Service
public class RoomService {
	@Autowired
	private RoomRepository roomRepository;
	
	public Room saveOne(Room room) {
		return roomRepository.save(room);
	}
	
	public List<Room> saveMany(List<Room> rooms) {
		return roomRepository.saveAll(rooms);
	}
	
	public List<Room> getAll() {
		return roomRepository.findAll();
	}
	
	public Room getOne(int id) {
		return roomRepository.findById(id).orElse(null);
	}
	public void deleteRoom(int id) {
		roomRepository.deleteById(id); 
	}
	public Room updateRoom(Room room) {
		Room existingRoom = roomRepository.findById(room.getROOM_ID()).orElse(null);
		existingRoom.setROOM_NAME(room.getROOM_NAME());
		existingRoom.setROOM_CAPACITY(room.getROOM_CAPACITY());
		existingRoom.setROOM_FLOOR(room.getROOM_FLOOR());
		existingRoom.setROOM_TYPE(room.getROOM_TYPE());
		return roomRepository.save(existingRoom);
	}

}
