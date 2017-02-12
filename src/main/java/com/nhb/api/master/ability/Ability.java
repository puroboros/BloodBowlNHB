package com.nhb.api.master.ability;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.nhb.api.master.abilitytype.AbilityType;


public class Ability {
	@Id
	private String id;
	private String name;
	private String description;
	@DBRef
	private AbilityType abilityType;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public AbilityType getAbilityType() {
		return abilityType;
	}
	public void setAbilityType(AbilityType abilityType) {
		this.abilityType = abilityType;
	}
	@Override
	public String toString() {
		return "Ability [Id=" + id + ", name=" + name + ", description=" + description + ", abilityType=" + abilityType
				+ "]";
	}
	
}
