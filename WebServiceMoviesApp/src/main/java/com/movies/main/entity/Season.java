package com.movies.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="season")
public class Season {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name="season_numberOfEpisodes")
	private Integer numberOfEpisodes;
	
	@Column(name="season_seasonNumber")
	private Integer seasonNumber;
	
	@Column(name="season_image")
	private String seasonImage;
	
	@ManyToOne()
	private TVSeries tvSeries;

	public Season() {}
	
	public Season(Integer id, Integer numberOfEpisodes, Integer seasonNumber, String seasonImage, TVSeries tvSeries) {
		this.Id = id;
		this.numberOfEpisodes = numberOfEpisodes;
		this.seasonNumber = seasonNumber;
		this.seasonImage = seasonImage;
		this.tvSeries = tvSeries;
	}
	
	public String getSeasonImage() {
		return seasonImage;
	}
	
	public void setSeasonImage(String seasonImage) {
		this.seasonImage = seasonImage;
	}

	public TVSeries getTvSeries() {
		return tvSeries;
	}

	public void setTvSeries(TVSeries tvSeries) {
		this.tvSeries = tvSeries;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getNumberOfEpisodes() {
		return numberOfEpisodes;
	}

	public void setNumberOfEpisodes(Integer numberOfEpisodes) {
		this.numberOfEpisodes = numberOfEpisodes;
	}

	public Integer getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	@Override
	public String toString() {
		return "Season [Id=" + Id + ", numberOfEpisodes=" + numberOfEpisodes + ", seasonNumber=" + seasonNumber
				+ ", tvSeries=" + tvSeries + "]";
	}
	
	
}
