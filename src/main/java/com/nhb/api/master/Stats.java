package com.nhb.api.master;

public class Stats {
	
	private Integer movement;
	private Integer strength;
	private Integer agility;
	private Integer armor;
	
	public Integer getMovement() {
		return movement;
	}
	public void setMovement(Integer movement) {
		this.movement = movement;
	}
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public Integer getAgility() {
		return agility;
	}
	public void setAgility(Integer agility) {
		this.agility = agility;
	}
	public Integer getArmor() {
		return armor;
	}
	public void setArmor(Integer armor) {
		this.armor = armor;
	}
	@Override
	public String toString() {
		return "Stats [movement=" + movement + ", strength=" + strength + ", agility=" + agility + ", armor=" + armor
				+ "]";
	}
	
	
}
