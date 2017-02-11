package com.nhb.api.master.positional;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.nhb.api.master.Stats;

public class Positional {
	@Id
	private String id;
	private String race;
	private String name;
	private Integer cost;
	private List<String> normalAbilityTipes;
	private List<String> doubleAbilityTipes;
	private List<String> baseAbilities;
	private Stats stats;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public List<String> getNormalAbilityTipes() {
		return normalAbilityTipes;
	}
	public void setNormalAbilityTipes(List<String> normalAbilityTipes) {
		this.normalAbilityTipes = normalAbilityTipes;
	}
	public List<String> getDoubleAbilityTipes() {
		return doubleAbilityTipes;
	}
	public void setDoubleAbilityTipes(List<String> doubleAbilityTipes) {
		this.doubleAbilityTipes = doubleAbilityTipes;
	}
	public List<String> getBaseAbilities() {
		return baseAbilities;
	}
	public void setBaseAbilities(List<String> baseAbilities) {
		this.baseAbilities = baseAbilities;
	}
	public Stats getStats() {
		return stats;
	}
	public void setStats(Stats stats) {
		this.stats = stats;
	}
	@Override
	public String toString() {
		return "Positional [id=" + id + ", race=" + race + ", name=" + name + ", cost=" + cost + ", normalAbilityTipes="
				+ normalAbilityTipes + ", doubleAbilityTipes=" + doubleAbilityTipes + ", baseAbilities=" + baseAbilities
				+ ", stats=" + stats + "]";
	}
	
	
}
