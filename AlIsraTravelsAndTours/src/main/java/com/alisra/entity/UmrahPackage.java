package com.alisra.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="UmrahPackage")
public class UmrahPackage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer umrahPackageId;
	
	private Integer umrahPackageApprovalRate;
	
	@OneToMany
	private List<Hotels> hotel = new ArrayList<>();
	
	public UmrahPackage() {}

	public UmrahPackage(Integer umrahPackageId, Integer umrahPackageApprovalRate , List<Hotels> hotel) {
		this.umrahPackageId = umrahPackageId;
		this.umrahPackageApprovalRate = umrahPackageApprovalRate;
		this.hotel = hotel;
	}
	
	@Override
	public String toString() {
		return "UmrahPackage [umrahPackageId=" + umrahPackageId + ", umrahPackageApprovalRate="
				+ umrahPackageApprovalRate + ", hotel=" + hotel + "]";
	}

	public Integer getUmrahPackageId() {
		return umrahPackageId;
	}

	public void setUmrahPackageId(Integer umrahPackageId) {
		this.umrahPackageId = umrahPackageId;
	}

	public Integer getUmrahPackageApprovalRate() {
		return umrahPackageApprovalRate;
	}

	public void setUmrahPackageApprovalRate(Integer umrahPackageApprovalRate) {
		this.umrahPackageApprovalRate = umrahPackageApprovalRate;
	}

	public List<Hotels> getHotel() {
		return hotel;
	}

	public void setHotel(List<Hotels> hotel) {
		this.hotel = hotel;
	}
	
}
