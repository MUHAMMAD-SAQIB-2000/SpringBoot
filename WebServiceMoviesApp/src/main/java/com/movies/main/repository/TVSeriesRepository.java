package com.movies.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movies.main.entity.TVSeries;

@Repository
public interface TVSeriesRepository extends JpaRepository<TVSeries, Integer> {
	public List<TVSeries> findByTvSeriesName(String tvSeriesName);
}
