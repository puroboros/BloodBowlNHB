package com.nhb.api.master.starplayer;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.nhb.api.master.Stats;
import com.nhb.api.master.ability.Ability;
import com.nhb.api.master.race.Race;

public class StarPlayer {
	@Id
	private String id;
	@DBRef
	private List<Race> races;
	private String name;
	private Integer cost;
	@DBRef
	private List<Ability> baseAbilities;
	private Stats stats;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Race> getRaces() {
		return races;
	}
	public void setRaces(List<Race> races) {
		this.races = races;
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
		return "StarPlayer [id=" + id + ", races=" + races + ", name=" + name + ", cost=" + cost + ", baseAbilities="
				+ baseAbilities + ", stats=" + stats + "]";
	}
	
	
}
