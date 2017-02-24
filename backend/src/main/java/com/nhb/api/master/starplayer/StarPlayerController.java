package com.nhb.api.master.starplayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/starplayers")
public class StarPlayerController {
	@Autowired
	private StarPlayerService raceService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<StarPlayer> listAbilities(){
		return raceService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id:.+}")
	public StarPlayer findAbility(@PathVariable String id){
		return raceService.find(id);
	}
}
