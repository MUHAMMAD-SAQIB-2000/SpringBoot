package com.webservice.course.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course")
public class Course {
	
	@Id
	@GeneratedValue
	@Column(name = "course_id")
	private int COURSE_ID;
	
	@Column(name = "course_code")
	private String COURSE_CODE;
	
	@Column(name = "course_title")
	private String COURSE_TITLE;
	
	@Column(name = "course_desc")
	private String COURSE_DESC;
	
	@Column(name = "course_credithour")
	private int COURSE_CREDITHOUR;
	
	@OneToOne
	private Course COURSE_PREREQUIST;
	
	public Course() {
		
	}
	
	public Course(int cOURSE_ID, String cOURSE_CODE, String cOURSE_TITLE, String cOURSE_DESC, int cOURSE_CREDITHOUR,
			Course cOURSE_PREREQUIST) {
		super();
		COURSE_ID = cOURSE_ID;
		COURSE_CODE = cOURSE_CODE;
		COURSE_TITLE = cOURSE_TITLE;
		COURSE_DESC = cOURSE_DESC;
		COURSE_CREDITHOUR = cOURSE_CREDITHOUR;
		this.COURSE_PREREQUIST = cOURSE_PREREQUIST;
	}

	public int getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(int cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}

	public String getCOURSE_CODE() {
		return COURSE_CODE;
	}

	public void setCOURSE_CODE(String cOURSE_CODE) {
		COURSE_CODE = cOURSE_CODE;
	}

	public String getCOURSE_TITLE() {
		return COURSE_TITLE;
	}

	public void setCOURSE_TITLE(String cOURSE_TITLE) {
		COURSE_TITLE = cOURSE_TITLE;
	}

	public String getCOURSE_DESC() {
		return COURSE_DESC;
	}

	public void setCOURSE_DESC(String cOURSE_DESC) {
		COURSE_DESC = cOURSE_DESC;
	}

	public int getCOURSE_CREDITHOUR() {
		return COURSE_CREDITHOUR;
	}

	public void setCOURSE_CREDITHOUR(int cOURSE_CREDITHOUR) {
		COURSE_CREDITHOUR = cOURSE_CREDITHOUR;
	}

	public Course getCOURSE_PREREQUIST() {
		return COURSE_PREREQUIST;
	}

	public void setCOURSE_PREREQUIST(Course cOURSE_PREREQUIST) {
		COURSE_PREREQUIST = cOURSE_PREREQUIST;
	}

}
