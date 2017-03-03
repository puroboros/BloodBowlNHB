package com.nhb.api.competition.match;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.nhb.api.competition.competition.Competition;
import com.nhb.api.competitive.team.Team;

public class Match {
	@Id
	private String id;
	@DBRef
	private Team team1;
	@DBRef
	private Team team2;
	@DBRef
	private Competition competition;
	private Integer touchdown1;
	private Integer touchdown2;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	public Competition getCompetition() {
		return competition;
	}
	public void setCompetition(Competition competition) {
		this.competition = competition;
	}
	public Integer getTouchdown1() {
		return touchdown1;
	}
	public void setTouchdown1(Integer touchdown1) {
		this.touchdown1 = touchdown1;
	}
	public Integer getTouchdown2() {
		return touchdown2;
	}
	public void setTouchdown2(Integer touchdown2) {
		this.touchdown2 = touchdown2;
	}
	@Override
	public String toString() {
		return "Match [id=" + id + ", team1=" + team1 + ", team2=" + team2 + ", competition=" + competition
				+ ", touchdown1=" + touchdown1 + ", touchdown2=" + touchdown2 + "]";
	}
	
	
}
