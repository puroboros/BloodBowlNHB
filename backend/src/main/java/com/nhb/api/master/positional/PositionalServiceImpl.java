package com.nhb.api.master.positional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionalServiceImpl implements PositionalService{
	@Autowired
	protected PositionalRepository positionalRepository;
	public Positional add(Positional ability) {
		return positionalRepository.save(ability);
	}
	
	public List<Positional> findAll(){
		return positionalRepository.findAll();
	}
	
	public Positional find(String id){
		return positionalRepository.findOne(id);
	}

}
