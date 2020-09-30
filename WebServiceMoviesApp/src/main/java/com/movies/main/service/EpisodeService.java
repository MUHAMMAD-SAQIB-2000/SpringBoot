package com.movies.main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.main.entity.Episode;
import com.movies.main.repository.EpisodeRepository;

@Service
public class EpisodeService {
	
	@Autowired
	private EpisodeRepository epRepo;
	
	public List<Episode> getAllEpisodes(Integer Id){
		List<Episode> episodes = epRepo.findAll().stream()
			.filter(episode -> episode.getSeason().getId().equals(Id))
			.collect(Collectors.toList());
		return episodes;
	}
	
	public Episode getEpisode(Integer Id){
		Episode episodes = epRepo.findById(Id).orElse(null);
		return episodes;
	}

}
