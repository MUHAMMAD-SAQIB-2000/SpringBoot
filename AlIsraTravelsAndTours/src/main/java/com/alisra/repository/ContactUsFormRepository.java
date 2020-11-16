package com.alisra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alisra.entity.ContactUsForm;

@Repository
public interface ContactUsFormRepository extends JpaRepository<ContactUsForm, Integer>{

}
