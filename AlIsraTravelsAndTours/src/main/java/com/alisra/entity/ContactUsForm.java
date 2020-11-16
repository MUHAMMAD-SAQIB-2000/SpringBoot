package com.alisra.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact_us_form")
public class ContactUsForm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contactId;
	
	private String contactName;
	private String contactMessage;
	private String contactEmail;
	private String contactNumber;
	
	public ContactUsForm() {}

	public ContactUsForm(Integer contactId, String contactName, String contactMessage, String contactEmail,
			String contactNumber) {
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactMessage = contactMessage;
		this.contactEmail = contactEmail;
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "ContactUsForm [contactId=" + contactId + ", contactName=" + contactName + ", contactMessage="
				+ contactMessage + ", contactEmail=" + contactEmail + ", contactNumber=" + contactNumber + "]";
	}

	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactMessage() {
		return contactMessage;
	}
	public void setContactMessage(String contactMessage) {
		this.contactMessage = contactMessage;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	
}
