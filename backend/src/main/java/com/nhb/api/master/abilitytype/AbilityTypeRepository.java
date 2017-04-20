package com.nhb.api.master.abilitytype;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AbilityTypeRepository extends MongoRepository<AbilityType, String>{
	public List<AbilityType> findByNameContainingIgnoreCase(String name);
}
