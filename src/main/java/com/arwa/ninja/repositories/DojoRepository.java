package com.arwa.ninja.repositories;

import org.springframework.stereotype.Repository;



import com.arwa.ninja.models.Dojo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface DojoRepository extends CrudRepository <Dojo,Long> {
	
	List<Dojo> findAll();
	
    Optional<Dojo> findById(Long id);


	
	
	

	

}
