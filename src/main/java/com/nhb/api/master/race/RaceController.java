package com.nhb.api.master.race;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Race> listAbilities(){
		return raceService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id:.+}")
	public Race findAbility(@PathVariable String id){
		return raceService.find(id);
	}
}
