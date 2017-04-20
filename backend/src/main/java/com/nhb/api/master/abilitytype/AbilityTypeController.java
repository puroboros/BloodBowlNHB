package com.nhb.api.master.abilitytype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/abilitytipes")
public class AbilityTypeController {
	@Autowired
	private AbilityTypeService abilityService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<AbilityType> listAbilities(){
		return abilityService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id:.+}")
	public AbilityType findAbility(@PathVariable String id){
		return abilityService.find(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/find/{name:.+}")
	public List<AbilityType> findByName(@PathVariable String name){
		return abilityService.findByName(name);
	}
}
