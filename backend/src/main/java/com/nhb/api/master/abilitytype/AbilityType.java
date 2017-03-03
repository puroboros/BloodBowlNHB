package com.nhb.api.master.abilitytype;

import org.springframework.data.annotation.Id;

public class AbilityType {
	@Id
	private String id;
	private String name;
	public AbilityType(){}
	public AbilityType(String id, String name){
		this.id = id;
		this.name = name;
	}
	public AbilityType(String name){
		this.name = name;
	}
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
	@Override
	public String toString() {
		return "AbilityType [id=" + id + ", name=" + name + "]";
	}
	
}
