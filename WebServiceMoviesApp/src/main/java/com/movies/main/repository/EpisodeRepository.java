package com.movies.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movies.main.entity.Episode;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode, Integer> {

	List<Episode> findAll();

}
