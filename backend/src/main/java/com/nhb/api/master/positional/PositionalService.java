package com.nhb.api.master.positional;

import java.util.List;

public interface PositionalService {
	public Positional add(Positional ability);
	public List<Positional> findAll();
	public Positional find(String id);
}
