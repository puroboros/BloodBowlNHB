package com.nhb.api.master.ability;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/abilities")
public class AbilityController {
	@Autowired
	private AbilityService abilityService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Ability> listAbilities(){
		return abilityService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id:.+}")
	public Ability findAbility(@PathVariable String id){
		return abilityService.find(id);
	}
}
