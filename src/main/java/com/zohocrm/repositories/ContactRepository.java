package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.zohocrm.entities.Contact;

public interface ContactRepository extends JpaRepositoryImplementation<Contact, Long>{

}
