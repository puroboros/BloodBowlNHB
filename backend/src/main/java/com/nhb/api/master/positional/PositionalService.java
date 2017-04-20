package com.nhb.api.master.positional;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PositionalService {
	public Positional add(Positional positional);
	public List<Positional> findAll();
	public Page<Positional> findAll(Pageable page);
	public Positional find(String id);
}
