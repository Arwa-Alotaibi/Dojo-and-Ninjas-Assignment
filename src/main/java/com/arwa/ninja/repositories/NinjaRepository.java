package com.arwa.ninja.repositories;


import org.springframework.stereotype.Repository;

import com.arwa.ninja.models.Dojo;
import com.arwa.ninja.models.Ninja;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface NinjaRepository extends  CrudRepository <Ninja,Long>{
	
	List<Ninja> findAll();
	
    Optional<Ninja> findById(Long id);
    
    List<Ninja> findAllBydojo(Dojo dojo);

}
