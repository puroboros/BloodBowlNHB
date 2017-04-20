package com.nhb.api.master.race;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.nhb.api.master.positional.Positional;

public class PositionalPerTeam {
	@DBRef
	public Race race;
	@DBRef 
	public Positional positional;
	
	public Integer max;

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Positional getPositional() {
		return positional;
	}

	public void setPositional(Positional positional) {
		this.positional = positional;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "PositionalPerTeam [race=" + race + ", positional=" + positional + ", max=" + max + "]";
	}
	
	
	
}
