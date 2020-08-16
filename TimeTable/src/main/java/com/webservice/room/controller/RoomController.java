package com.webservice.room.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.room.entity.Room;
import com.webservice.room.service.RoomService;

@RestController
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@RequestMapping("/room")
	public String inRoom() {
		return "In Room Controller of timetable webservice project!!! ";
	}
	
	@PostMapping("/room/saveOne")
	public Room saveOne(@RequestBody Room room) {
		return roomService.saveOne(room);
	}
	
	@PostMapping("/room/saveMany")
	public List<Room> saveMany(@RequestBody List<Room> rooms) {
		return roomService.saveMany(rooms);
	}
	
	@GetMapping("/room/displayAllRooms")
	public List<Room> getOneRoom() {
		return roomService.getAll();
	}
	
	@GetMapping("/room/displayOneRoom/{id}")
	public Room getOneRoom(@PathVariable int id) {
		return roomService.getOne(id);
	}
	
	@DeleteMapping("/room/deleteOneRoom/{id}")
	public String deleteOneRoom(@PathVariable int id) {
		roomService.deleteRoom(id);
		return " Record with " + id + " is deleted!!!";
	}
	
	@PutMapping("/room/updateOneRoom")
	public Room updateOneRoom(@RequestBody  Room room) {
		return roomService.saveOne(room);
	}
}
