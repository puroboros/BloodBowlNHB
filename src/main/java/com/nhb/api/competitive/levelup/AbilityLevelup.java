package com.nhb.api.competitive.levelup;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.nhb.api.master.ability.Ability;

public class AbilityLevelup extends Levelup{
	@DBRef
	private Ability ability;
	public Ability getAbility() {
		return ability;
	}
	public void setAbility(Ability ability) {
		this.ability = ability;
	}
	@Override
	public String toString() {
		return "AbilityLevelup [ability=" + ability + "]";
	}
	
	
}
