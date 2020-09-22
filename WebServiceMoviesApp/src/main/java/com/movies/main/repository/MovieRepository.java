package com.movies.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movies.main.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	public List<Movie> findByMovieName(String movieName);

}
