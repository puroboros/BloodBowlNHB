package com.nhb.api.master.race;

import java.util.List;

public interface RaceService {
	public Race add(Race ability);
	public List<Race> findAll();
	public Race find(String id);
	public Race findByName(String name);
}
