package com.movies.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="movie_desc")
	private String movieDesc;
	
	@Column(name="movie_release_year")
	private Long movieReleaseYear;
	
	@Column(name="movie_rating")
	private double movieRating;
	
	@Column(name="movie_img")
	private String movieImage;
	
	@Column(name="movie_link")
	private String movieLink;
	
	public Movie() {
	}

	public Movie(Integer id, String movie_Name, String movie_Desc, Long movie_ReleaseYear, double movie_Rating , String movie_Image ,String movieLink) {
		this.Id = id;
		this.movieName = movie_Name;
		this.movieDesc = movie_Desc;
		this.movieReleaseYear = movie_ReleaseYear;
		this.movieRating = movie_Rating;
		this.movieImage = movie_Image;
		this.movieLink = movieLink;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDesc() {
		return movieDesc;
	}

	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}

	public Long getMovieReleaseYear() {
		return movieReleaseYear;
	}

	public void setMovieReleaseYear(Long movieReleaseYear) {
		this.movieReleaseYear = movieReleaseYear;
	}

	public double getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}

	public String getMovieImage() {
		return movieImage;
	}

	public void setMovieImage(String movieImage) {
		this.movieImage = movieImage;
	}

	public String getMovieLink() {
		return movieLink;
	}

	public void setMovieLink(String movieLink) {
		this.movieLink = movieLink;
	}

	
	
	
}
