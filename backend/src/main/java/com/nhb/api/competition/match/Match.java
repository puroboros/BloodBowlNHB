package com.nhb.api.competition.match;

import org.springframework.data.annotation.Id;

import com.nhb.api.competition.competition.Competition;
import com.nhb.api.competitive.team.Team;

public class Match {
	@Id
	private String id;
	private Team team1;
	private Team team2;
	private Competition competition;
	private Integer touchdown1;
	private Integer touchdown2;
}
