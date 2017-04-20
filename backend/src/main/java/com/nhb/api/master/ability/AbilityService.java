package com.nhb.api.master.ability;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AbilityService {
	public Ability add(Ability ability);
	public List<Ability> findAll();
	public Ability find(String id);
	public Page<Ability> find(String abilityID, String abilityName, String abilityTypeName, Pageable page);
}
