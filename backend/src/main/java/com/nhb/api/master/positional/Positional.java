package com.nhb.api.master.positional;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.nhb.api.master.Stats;
import com.nhb.api.master.ability.Ability;
import com.nhb.api.master.race.Race;

public class Positional {
	@Id
	private String id;
	@DBRef
	private Race race;
	private String name;
	private Integer cost;
	@DBRef
	private List<Ability> normalAbilityTipes;
	@DBRef
	private List<Ability> doubleAbilityTipes;
	@DBRef
	private List<Ability> baseAbilities;
	private Stats stats;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Race getRace() {
		return race;
	}
	public void setRace(Race race) {
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
	public List<Ability> getNormalAbilityTipes() {
		return normalAbilityTipes;
	}
	public void setNormalAbilityTipes(List<Ability> normalAbilityTipes) {
		this.normalAbilityTipes = normalAbilityTipes;
	}
	public List<Ability> getDoubleAbilityTipes() {
		return doubleAbilityTipes;
	}
	public void setDoubleAbilityTipes(List<Ability> doubleAbilityTipes) {
		this.doubleAbilityTipes = doubleAbilityTipes;
	}
	public List<Ability> getBaseAbilities() {
		return baseAbilities;
	}
	public void setBaseAbilities(List<Ability> baseAbilities) {
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
