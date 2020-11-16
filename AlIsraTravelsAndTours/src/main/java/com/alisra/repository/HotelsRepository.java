package com.alisra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alisra.entity.Hotels;

@Repository
public interface HotelsRepository extends JpaRepository<Hotels, Integer> {

}
