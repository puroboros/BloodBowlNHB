package com.nhb.api.master.abilitytype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbilityTypeServiceImpl implements AbilityTypeService{
	@Autowired
	protected AbilityTypeRepository abilityTypeRepository;
	public AbilityType add(AbilityType ability) {
		return abilityTypeRepository.save(ability);
	}
	
	public List<AbilityType> findAll(){
		return abilityTypeRepository.findAll();
	}
	
	public AbilityType find(String id){
		return abilityTypeRepository.findOne(id);
	}

}
