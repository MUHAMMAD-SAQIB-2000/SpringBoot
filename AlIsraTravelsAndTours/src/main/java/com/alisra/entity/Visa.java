package com.alisra.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "visa")
public class Visa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer visaId;

	private String visaCountry;
	private String visaFor;
	private String visaValidity;
	private String visaCoutryStayLimit;
	private Long visaPrice;
	//private List<String> visaRequirements = new ArrayList<>();
	//private List<String> visaTermsAndConditions = new ArrayList<>();

	public Visa() {}

	public Visa(Integer visaId, String visaCountry, String visaFor, String visaValidity, String visaCoutryStayLimit, Long visaPrice) {
		this.visaId = visaId;
		this.visaCountry = visaCountry;
		this.visaFor = visaFor;
		this.visaValidity = visaValidity;
		this.visaCoutryStayLimit = visaCoutryStayLimit;
		this.visaPrice = visaPrice;
	}

	@Override
	public String toString() {
		return "Visa [visaId=" + visaId + ", visaCountry=" + visaCountry + ", visaFor=" + visaFor + ", visaValidity="
				+ visaValidity + ", visaCoutryStayLimit=" + visaCoutryStayLimit + ", visaPrice=" + visaPrice + "]";
	}

	public Integer getVisaId() {
		return visaId;
	}

	public void setVisaId(Integer visaId) {
		this.visaId = visaId;
	}

	public String getVisaCountry() {
		return visaCountry;
	}

	public void setVisaCountry(String visaCountry) {
		this.visaCountry = visaCountry;
	}

	public String getVisaFor() {
		return visaFor;
	}

	public void setVisaFor(String visaFor) {
		this.visaFor = visaFor;
	}

	public String getVisaValidity() {
		return visaValidity;
	}

	public void setVisaValidity(String visaValidity) {
		this.visaValidity = visaValidity;
	}

	public String getVisaCoutryStayLimit() {
		return visaCoutryStayLimit;
	}

	public void setVisaCoutryStayLimit(String visaCoutryStayLimit) {
		this.visaCoutryStayLimit = visaCoutryStayLimit;
	}

	public Long getVisaPrice() {
		return visaPrice;
	}

	public void setVisaPrice(Long visaPrice) {
		this.visaPrice = visaPrice;
	}
}
