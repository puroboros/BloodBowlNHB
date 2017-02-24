package com.nhb.api.competition.competition;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.nhb.api.competition.match.Match;
import com.nhb.api.competitive.team.Team;

public class Competition {
	@Id
	private String id;
	private String name;
	@DBRef
	private List<Team> teams;
	@DBRef
	private List<Match> playedMatches;
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
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	public List<Match> getPlayedMatches() {
		return playedMatches;
	}
	public void setPlayedMatches(List<Match> playedMatches) {
		this.playedMatches = playedMatches;
	}
	public void addMatch(Match match){
		this.playedMatches.add(match);
	}
	@Override
	public String toString() {
		return "Competition [id=" + id + ", name=" + name + ", teams=" + teams + ", playedMatches=" + playedMatches
				+ "]";
	}
	
	
}
