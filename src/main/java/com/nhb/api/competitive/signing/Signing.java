package com.nhb.api.competitive.signing;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.nhb.api.competitive.injuries.Injury;
import com.nhb.api.competitive.levelup.Levelup;

public class Signing {
	@Id
	private String id;
	private String team;
	private String positional;
	@DBRef
	private List<Levelup> levelups;
	@DBRef
	private List<Injury> injuries;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPositional() {
		return positional;
	}
	public void setPositional(String positional) {
		this.positional = positional;
	}
	public List<Levelup> getLevelups() {
		return levelups;
	}
	public void setLevelups(List<Levelup> levelups) {
		this.levelups = levelups;
	}
	public List<Injury> getInjuries() {
		return injuries;
	}
	public void setInjuries(List<Injury> injuries) {
		this.injuries = injuries;
	}
	@Override
	public String toString() {
		return "Signing [id=" + id + ", team=" + team + ", positional=" + positional + ", levelups=" + levelups
				+ ", injuries=" + injuries + "]";
	}
	
	
	
	
}
