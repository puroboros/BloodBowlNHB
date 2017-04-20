package com.nhb.api.master.ability;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/abilities")
public class AbilityController {
	@Autowired
	private AbilityService abilityService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Page<Ability> listAbilities(@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "abilityTypeName", required = false) String abilityTypeName,
			Pageable page){
		return abilityService.find(id, name, abilityTypeName, page);
		//return abilityService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id:.+}")
	public Ability findAbility(@PathVariable String id){
		return abilityService.find(id);
	}
}
