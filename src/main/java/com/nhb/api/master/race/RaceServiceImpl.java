package com.nhb.api.master.race;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RaceServiceImpl implements RaceService{
	@Autowired
	protected RaceRepository raceRepository;
	public Race add(Race ability) {
		return raceRepository.save(ability);
	}
	
	public List<Race> findAll(){
		return raceRepository.findAll();
	}
	
	public Race find(String id){
		return raceRepository.findOne(id);
	}

	public Race findByName(String name) {
		return raceRepository.findByName(name);
	}

}
