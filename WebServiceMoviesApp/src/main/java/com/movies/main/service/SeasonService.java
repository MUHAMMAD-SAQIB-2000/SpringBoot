package com.movies.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.main.entity.Season;
import com.movies.main.entity.TVSeries;
import com.movies.main.repository.SeasonRepository;

@Service
public class SeasonService {
	
	@Autowired
	private SeasonRepository seasonRepository;
	
	public List<Season> home(TVSeries tvSeries) {
		List<Season> season = seasonRepository.findByTvSeries(tvSeries);
		return season;
	}
	
	public List<Season> allSeasons(){
		return seasonRepository.findAll();
	}
	
	public Season findSeason(Integer Id){
		return seasonRepository.findById(Id).orElse(null);
	}
	
}
