package com.movies.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movies.main.entity.Season;
import com.movies.main.entity.TVSeries;

@Repository
public interface SeasonRepository extends JpaRepository<Season, Integer> {
	public List<Season> findByTvSeries(TVSeries tvSeries); 
}
