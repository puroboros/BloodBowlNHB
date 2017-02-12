package com.nhb.api.competitive.team;

import org.springframework.data.annotation.Id;

public class Team {
	@Id
	private String id;
	private String player;
	private String race;
	
	private Boolean medic;
	private Integer cash;
	private Integer fanFactor;
	private Integer cheerleaders;
	private Integer assistants;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public Boolean getMedic() {
		return medic;
	}
	public void setMedic(Boolean medic) {
		this.medic = medic;
	}
	public Integer getCash() {
		return cash;
	}
	public void setCash(Integer cash) {
		this.cash = cash;
	}
	public Integer getFanFactor() {
		return fanFactor;
	}
	public void setFanFactor(Integer fanFactor) {
		this.fanFactor = fanFactor;
	}
	public Integer getCheerleaders() {
		return cheerleaders;
	}
	public void setCheerleaders(Integer cheerleaders) {
		this.cheerleaders = cheerleaders;
	}
	public Integer getAssistants() {
		return assistants;
	}
	public void setAssistants(Integer assistants) {
		this.assistants = assistants;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", player=" + player + ", race=" + race + ", medic=" + medic + ", cash=" + cash
				+ ", fanFactor=" + fanFactor + ", cheerleaders=" + cheerleaders + ", assistants=" + assistants + "]";
	}
	
	
}
