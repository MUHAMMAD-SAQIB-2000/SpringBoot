package com.movies.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.main.entity.TVSeries;
import com.movies.main.repository.TVSeriesRepository;

@Service
public class TVSeriesService {
	
	@Autowired
	private TVSeriesRepository tvSeriesRepository;
	
	public TVSeries getByName(String tvSeriesName){
		TVSeries tvSeriesByName =  tvSeriesRepository.findByTvSeriesName(tvSeriesName).stream()
							.filter(tvSeries -> tvSeries.getTvSeriesName().equals(tvSeriesName))
							.findFirst()
							.orElse(null);

		return tvSeriesByName;
	}
	
	public List<TVSeries> getAll(){
		return tvSeriesRepository.findAll();
	}
	
	public TVSeries getById(Integer Id){
		TVSeries series = tvSeriesRepository.findById(Id).orElse(null);
		return series;
	}
}
