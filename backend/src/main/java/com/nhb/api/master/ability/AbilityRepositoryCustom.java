package com.nhb.api.master.ability;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AbilityRepositoryCustom {
	public Page<Ability> find(String abilityID, String abilityName,  String abilityTypeName, Pageable page);
}
