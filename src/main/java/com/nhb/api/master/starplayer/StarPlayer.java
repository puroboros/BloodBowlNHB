package com.nhb.api.master.starplayer;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.nhb.api.master.Stats;

public class StarPlayer {
	@Id
	private String id;
	private List<String> races;
	private String name;
	private Integer cost;	
	private List<Integer> baseAbilities;
	private Stats stats;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getRaces() {
		return races;
	}
	public void setRaces(List<String> races) {
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
	public List<Integer> getBaseAbilities() {
		return baseAbilities;
	}
	public void setBaseAbilities(List<Integer> baseAbilities) {
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
