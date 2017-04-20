package com.nhb.api.master.race;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RaceServiceImpl implements RaceService{
	@Autowired
	protected RaceRepository raceRepository;
	public Race add(Race ability) {
		return raceRepository.save(ability);
	}
	
	public List<Race> findAll(){
		List<Race> list = new ArrayList<Race>();
		raceRepository.findAll().forEach(list::add);
		return list;
	}
	
	public Race find(String id){
		return raceRepository.findOne(id);
	}

	public Page<Race> findByName(String name) {
		return raceRepository.findByNameContainingIgnoreCase(name, null);
	}

	@Override
	public Page<Race> findAll(Pageable page) {
		return raceRepository.findAll(page);
	}

}
