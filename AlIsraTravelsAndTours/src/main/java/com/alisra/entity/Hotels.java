package com.alisra.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotels")
public class Hotels {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hotelId;
	
	private String hotelName;//
	
	private String hotelCity;
	
	private Integer hotelDistance;
	
	private String hotelCategory;
	
	private Integer hotelRoomSharingPrice;
	private Integer hotelRoomQuadPrice;
	private Integer hotelRoomTriplePrice;
	private Integer hotelRoomDoublePrice;

	public Hotels() {}
	
	public Hotels(Integer hotelId, String hotelName, String hotelCity, Integer hotelDistance, String hotelCategory,
			Integer hotelRoomSharingPrice, Integer hotelRoomQuadPrice, Integer hotelRoomTriplePrice,
			Integer hotelRoomDoublePrice) {
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelCity = hotelCity;
		this.hotelDistance = hotelDistance;
		this.hotelCategory = hotelCategory;
		this.hotelRoomSharingPrice = hotelRoomSharingPrice;
		this.hotelRoomQuadPrice = hotelRoomQuadPrice;
		this.hotelRoomTriplePrice = hotelRoomTriplePrice;
		this.hotelRoomDoublePrice = hotelRoomDoublePrice;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public Integer getHotelDistance() {
		return hotelDistance;
	}

	public void setHotelDistance(Integer hotelDistance) {
		this.hotelDistance = hotelDistance;
	}

	public String getHotelCategory() {
		return hotelCategory;
	}

	public void setHotelCategory(String hotelCategory) {
		this.hotelCategory = hotelCategory;
	}

	public Integer getHotelRoomSharingPrice() {
		return hotelRoomSharingPrice;
	}

	public void setHotelRoomSharingPrice(Integer hotelRoomSharingPrice) {
		this.hotelRoomSharingPrice = hotelRoomSharingPrice;
	}

	public Integer getHotelRoomQuadPrice() {
		return hotelRoomQuadPrice;
	}

	public void setHotelRoomQuadPrice(Integer hotelRoomQuadPrice) {
		this.hotelRoomQuadPrice = hotelRoomQuadPrice;
	}

	public Integer getHotelRoomTriplePrice() {
		return hotelRoomTriplePrice;
	}

	public void setHotelRoomTriplePrice(Integer hotelRoomTriplePrice) {
		this.hotelRoomTriplePrice = hotelRoomTriplePrice;
	}

	public Integer getHotelRoomDoublePrice() {
		return hotelRoomDoublePrice;
	}

	public void setHotelRoomDoublePrice(Integer hotelRoomDoublePrice) {
		this.hotelRoomDoublePrice = hotelRoomDoublePrice;
	}

}
