package com.arwa.ninja.services;

import java.util.List;

import java.util.Optional;


import org.springframework.stereotype.Service;

import com.arwa.ninja.models.Dojo;
import com.arwa.ninja.repositories.DojoRepository;


@Service
public class DojoServices {
	private final DojoRepository  dojoRepository;

	public DojoServices(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	
		// retrive all dojos
		public List <Dojo> FindAllDojo(){
			return dojoRepository.findAll();
		}
		
		
		// retrives a dojos
		
		public Dojo FindDojobyID(Long id) {
			Optional<Dojo> optionaldojo = dojoRepository.findById(id);
			if(optionaldojo.isPresent()) {
				return optionaldojo.get();
			}
			else {
				return null;

			}
			
			
		}
		// create dojo 
		public Dojo createdojo(Dojo dojo) {
			return dojoRepository.save(dojo);
		}
	

}
