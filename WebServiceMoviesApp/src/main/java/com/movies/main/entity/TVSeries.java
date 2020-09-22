package com.movies.main.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tvseries")
public class TVSeries {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name="tvseries_name")
	private String tvSeriesName;
	
	@Column(name="tvseries_desc")
	private String tvSeriesDesc;
	
	@Column(name="tvseries_release_year")
	private Long tvSeriesReleaseYear;
	
	@Column(name="tvseries_rating")
	private double tvSeriesRating;
	
	@Column(name="tvseries_img")
	private String tvSeriesImage;
	
	@Column(name="tvseries_number_of_seasons")
	private Integer tvSeriesNumberOfSeasons;
	
	@OneToMany(mappedBy = "tvSeries" , fetch=FetchType.EAGER)
	private List<Season> season = new ArrayList<Season>();
	
	public TVSeries() {
	}

	public TVSeries(Integer id, String tvSeriesName, String tvSeriesDesc, Long tvSeriesReleaseYear,
			double tvSeriesRating, String tvSeriesImage, Integer tvSeriesNumberOfSeasons, List<Season> season) {
		this.Id = id;
		this.tvSeriesName = tvSeriesName;
		this.tvSeriesDesc = tvSeriesDesc;
		this.tvSeriesReleaseYear = tvSeriesReleaseYear;
		this.tvSeriesRating = tvSeriesRating;
		this.tvSeriesImage = tvSeriesImage;
		this.tvSeriesNumberOfSeasons = tvSeriesNumberOfSeasons;
		this.season = season;
	}

	
	@Override
	public String toString() {
		return "TVSeries [Id=" + Id + ", tvSeriesName=" + tvSeriesName + ", tvSeriesDesc=" + tvSeriesDesc
				+ ", tvSeriesReleaseYear=" + tvSeriesReleaseYear + ", tvSeriesRating=" + tvSeriesRating
				+ ", tvSeriesImage=" + tvSeriesImage + ", tvSeriesNumberOfSeasons=" + tvSeriesNumberOfSeasons
				+ ", season=" + season + "]";
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTvSeriesName() {
		return tvSeriesName;
	}

	public void setTvSeriesName(String tvSeriesName) {
		this.tvSeriesName = tvSeriesName;
	}

	public String getTvSeriesDesc() {
		return tvSeriesDesc;
	}

	public void setTvSeriesDesc(String tvSeriesDesc) {
		this.tvSeriesDesc = tvSeriesDesc;
	}

	public Long getTvSeriesReleaseYear() {
		return tvSeriesReleaseYear;
	}

	public void setTvSeriesReleaseYear(Long tvSeriesReleaseYear) {
		this.tvSeriesReleaseYear = tvSeriesReleaseYear;
	}

	public double getTvSeriesRating() {
		return tvSeriesRating;
	}

	public void setTvSeriesRating(double tvSeriesRating) {
		this.tvSeriesRating = tvSeriesRating;
	}

	public String getTvSeriesImage() {
		return tvSeriesImage;
	}

	public void setTvSeriesImage(String tvSeriesImage) {
		this.tvSeriesImage = tvSeriesImage;
	}

	public Integer getTvSeriesNumberOfSeasons() {
		return tvSeriesNumberOfSeasons;
	}

	public void setTvSeriesNumberOfSeasons(Integer tvSeriesNumberOfSeasons) {
		this.tvSeriesNumberOfSeasons = tvSeriesNumberOfSeasons;
	}

	public List<Season> getSeason() {
		return season;
	}

	public void setSeason(List<Season> season) {
		this.season = season;
	}
	
	

}
