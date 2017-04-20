package com.nhb.api.master.race;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RaceService {
	public Race add(Race ability);
	public List<Race> findAll();
	public Page<Race> findAll(Pageable page);
	public Race find(String id);
	public Page<Race> findByName(String name);
}
