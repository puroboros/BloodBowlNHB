package com.nhb.api.master.race;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/races")
public class RaceController {
	@Autowired
	private RaceService raceService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Page<Race> listAbilities(Pageable page){
		return raceService.findAll(page);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id:.+}")
	public Race findAbility(@PathVariable String id){
		return raceService.find(id);
	}
}
