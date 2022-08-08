package com.arwa.ninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.arwa.ninja.models.Dojo;
import com.arwa.ninja.models.Ninja;
import com.arwa.ninja.repositories.NinjaRepository;

@Service
public class NinjaServices {
private final NinjaRepository   ninjaRepository;


public NinjaServices (NinjaRepository ninjaRepository) {
	this.ninjaRepository = ninjaRepository;
	
}
		// retrive all
		public List <Ninja> FindAllNinja(){
			return ninjaRepository.findAll();
	}
		// retrives a ninja
		
		public Ninja FindDojobyID(Long id) {
			
			Optional<Ninja> optionalninja = ninjaRepository.findById(id);
			if(optionalninja.isPresent()) {
				
				
				return optionalninja.get();
				
			
			}
			else {
				return null;

					}
					
					
				}




	// create ninja 
	public Ninja createninja(Ninja ninja ) {
		return ninjaRepository.save(ninja);
	}

	//all the ninjas that belong to that specific location.
	public List <Ninja> FindNinjaBelongDojo(Dojo dojo) {
		return ninjaRepository.findAllBydojo(dojo);
	}



}
