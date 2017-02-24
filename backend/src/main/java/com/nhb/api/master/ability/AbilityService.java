package com.nhb.api.master.ability;

import java.util.List;

public interface AbilityService {
	public Ability add(Ability ability);
	public List<Ability> findAll();
	public Ability find(String id);
}
