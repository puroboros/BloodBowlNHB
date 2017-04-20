package com.nhb.api.master.ability;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AbilityServiceImpl implements AbilityService{
	@Autowired
	protected AbilityRepository abilityRepository;
	public Ability add(Ability ability) {
		return abilityRepository.save(ability);
	}
	
	public List<Ability> findAll(){
		List<Ability> list = new ArrayList<Ability>();
		abilityRepository.findAll().forEach(list::add);
		return list;
	}
	
	public Ability find(String id){
		return abilityRepository.findOne(id);
	}
	
	public Page<Ability> find(String abilityID, String abilityName, String abilityTypeName,Pageable page){
		return abilityRepository.find(abilityID, abilityName, abilityTypeName, page);
	}

}
