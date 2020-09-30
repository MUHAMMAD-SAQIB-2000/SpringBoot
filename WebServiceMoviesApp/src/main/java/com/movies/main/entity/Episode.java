package com.movies.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="episode")
public class Episode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name="episode_number")
	private Integer episodeNumber;
	
	@Column(name="episode_name")
	private String episodeName;
	
	@Column(name="episode_Link")
	private String episodeLink;
	
	@ManyToOne
	private Season season;
	
	public Episode() {}

	public Episode(Integer id, Integer episodeNumber, String episodeName, Season season , String episodeLink) {
		this.Id = id;
		this.episodeNumber = episodeNumber;
		this.episodeName = episodeName;
		this.season = season;
		this.episodeLink = episodeLink;
	}

	public String getEpisodeLink() {
		return episodeLink;
	}

	public void setEpisodeLink(String episodeLink) {
		this.episodeLink = episodeLink;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getEpisodeNumber() {
		return episodeNumber;
	}

	public void setEpisodeNumber(Integer episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

	public String getEpisodeName() {
		return episodeName;
	}

	public void setEpisodeName(String episodeName) {
		this.episodeName = episodeName;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}
	
}
