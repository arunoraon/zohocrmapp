package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.zohocrm.entities.Lead;

public interface LeadRepository extends JpaRepositoryImplementation<Lead, Long>{

}
