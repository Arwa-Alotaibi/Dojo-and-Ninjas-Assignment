package com.arwa.ninja.controllers;

import java.util.List;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arwa.ninja.models.Dojo;
import com.arwa.ninja.models.Ninja;
import com.arwa.ninja.services.DojoServices;
import com.arwa.ninja.services.NinjaServices;

@Controller
public class DojoNinjaController {
	
	private final DojoServices dojoServices;
	
	private final NinjaServices ninjaServices;
	
	public DojoNinjaController(DojoServices dojoServices , NinjaServices ninjaServices) {
		this.dojoServices =dojoServices ;
		this.ninjaServices = ninjaServices ;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String createdojo(@ModelAttribute("dojo") Dojo dojo) {
		List<Dojo> dojos=dojoServices.FindAllDojo();

		return "createdojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String cratingdojo(@ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		
			dojoServices.createdojo(dojo);
			
			return "redirect:/";
			
		
		
	}
	
	@GetMapping("/ninjas/new")
	public String CreateNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos=dojoServices.FindAllDojo();
		List<Ninja> Ninjas=ninjaServices.FindAllNinja();

		model.addAttribute("dojos", dojos);
		
		return "createninja.jsp";
		
	}
	
	@PostMapping("/ninjas/new")
	public String cratingninja( @ModelAttribute("ninja") Ninja ninja) {
		
			ninjaServices.createninja(ninja);
			
			return "redirect:/";
			
		}
		
	
	
	//Have a dojo show page show information of all the ninjas that belong to that specific location.


	@RequestMapping("/dojos/{id}")
	public String Show(@PathVariable("id")Long id, Model model) {
		
		Dojo dojo_id = dojoServices.FindDojobyID(id);
		
		model.addAttribute("dojo_id",dojo_id);
	
		return "show.jsp";
	}
	

}

////Have a dojo show page show information of all the ninjas that belong to that specific location

//Dojo dojo_id= dojoServices.FindDojobyID(id);

//List <Ninja> ninjaBelongDojo= ninjaServices.FindNinjaBelongDojo(dojo_id);


//model.addAttribute("dojo_id",dojo_id);

//model.addAttribute("ninjaBelongDojo",ninjaBelongDojo);

