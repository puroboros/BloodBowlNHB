package com.nhb.api.master.starplayer;

import java.util.List;

public interface StarPlayerService {
	public StarPlayer add(StarPlayer ability);
	public List<StarPlayer> findAll();
	public StarPlayer find(String id);
}
