package com.webservice.room.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "room")
public class Room {
	@Id
	@GeneratedValue
	@Column(name = "roomid")
	private int ROOM_ID;
	@Column(name = "room_name")
	private String ROOM_NAME;
	
	@Column(name = "room_type")
	private String ROOM_TYPE;
	
	@Column(name = "room_capacity")
	private String ROOM_CAPACITY;
	
	@Column(name = "room_floor")
	private String ROOM_FLOOR;
	
	public Room() {
		
	}
	
	public Room(int rOOM_ID, String rOOM_NAME, String rOOM_TYPE, String rOOM_CAPACITY, String rOOM_FLOOR) {
		super();
		ROOM_ID = rOOM_ID;
		ROOM_NAME = rOOM_NAME;
		ROOM_TYPE = rOOM_TYPE;
		ROOM_CAPACITY = rOOM_CAPACITY;
		ROOM_FLOOR = rOOM_FLOOR;
	}
	public int getROOM_ID() {
		return ROOM_ID;
	}
	public void setROOM_ID(int rOOM_ID) {
		ROOM_ID = rOOM_ID;
	}
	public String getROOM_NAME() {
		return ROOM_NAME;
	}
	public void setROOM_NAME(String rOOM_NAME) {
		ROOM_NAME = rOOM_NAME;
	}
	public String getROOM_TYPE() {
		return ROOM_TYPE;
	}
	public void setROOM_TYPE(String rOOM_TYPE) {
		ROOM_TYPE = rOOM_TYPE;
	}
	public String getROOM_CAPACITY() {
		return ROOM_CAPACITY;
	}
	public void setROOM_CAPACITY(String rOOM_CAPACITY) {
		ROOM_CAPACITY = rOOM_CAPACITY;
	}
	public String getROOM_FLOOR() {
		return ROOM_FLOOR;
	}
	public void setROOM_FLOOR(String rOOM_FLOOR) {
		ROOM_FLOOR = rOOM_FLOOR;
	}
	
	
}
