package com.nhb.api.master.abilitytype;

import java.util.List;

public interface AbilityTypeService {
	public AbilityType add(AbilityType abilityType);
	public List<AbilityType> findAll();
	public List<AbilityType> findByName(String name);
	public AbilityType find(String id);
}
