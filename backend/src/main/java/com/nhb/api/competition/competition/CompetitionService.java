package com.nhb.api.competition.competition;

import java.util.List;

public interface CompetitionService {
	Competition find(String id);
	Competition insert(Competition competition);
	Competition update(Competition competition);
	void delete(Competition comp);
	List<Competition> findAll();
}
