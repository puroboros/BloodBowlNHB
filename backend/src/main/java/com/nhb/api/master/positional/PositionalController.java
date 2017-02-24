package com.nhb.api.master.positional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/positionals")
public class PositionalController {
	@Autowired
	private PositionalService abilityService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Positional> listAbilities(){
		return abilityService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id:.+}")
	public Positional findAbility(@PathVariable String id){
		return abilityService.find(id);
	}
}
