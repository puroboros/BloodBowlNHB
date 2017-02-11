package com.nhb.api.master.ability;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbilityServiceImpl implements AbilityService{
	@Autowired
	protected AbilityRepository abilityRepository;
	public Ability add(Ability ability) {
		return abilityRepository.save(ability);
	}
	
	public List<Ability> findAll(){
		return abilityRepository.findAll();
	}
	
	public Ability find(String id){
		return abilityRepository.findOne(id);
	}

}
