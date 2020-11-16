package com.alisra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alisra.entity.Visa;

@Repository
public interface VisaRepository extends JpaRepository<Visa, Integer>{

}
