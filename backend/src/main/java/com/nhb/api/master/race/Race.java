package com.nhb.api.master.race;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.nhb.api.master.positional.Positional;

public class Race {
	@Id
	private String id;
	private String name;
	private Integer rerollCost;
	private Boolean medic;
	@DBRef
	private Positional mercenary;
	
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
//	public Dictionary<String, Integer> getPositionals() {
//		return positionals;
//	}
//	public void setPositionals(Dictionary<String, Integer> positionals) {
//		this.positionals = positionals;
//	}
//	
//	public Dictionary<String, Integer> addPositional(String id, Integer max){
//		this.positionals.put(id, max);
//		return this.positionals;
//	}
//	
//	public Dictionary<String, Integer> addPositional(Positional positional, Integer max){
//		this.positionals.put(positional.getId(), max);
//		return this.positionals;
//	}
	public Positional getMercenary() {
		return mercenary;
	}
	public void setMercenary(Positional mercenary) {
		this.mercenary = mercenary;
	}
//	@Override
//	public String toString() {
//		return "Race [id=" + id + ", name=" + name + ", rerollCost=" + rerollCost + ", medic=" + medic
//				+ ", positionals=" + positionals + ", mercenary=" + mercenary + "]";
//	}
	
	
	
	
}
