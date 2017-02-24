package com.nhb.api.master.race;

import org.springframework.data.annotation.Id;

public class Race {
	@Id
	private String id;
	private String name;
	private Integer rerollCost;
	private Boolean medic;
	
	public Integer getRerollCost() {
		return rerollCost;
	}
	public void setRerollCost(Integer rerollCost) {
		this.rerollCost = rerollCost;
	}
	public Boolean getMedic() {
		return medic;
	}
	public void setMedic(Boolean medic) {
		this.medic = medic;
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
		return "Race [id=" + id + ", name=" + name + ", rerollCost=" + rerollCost + ", medic=" + medic + "]";
	}
	
	
}
