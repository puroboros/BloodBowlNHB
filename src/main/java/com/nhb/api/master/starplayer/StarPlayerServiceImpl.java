package com.nhb.api.master.starplayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StarPlayerServiceImpl implements StarPlayerService{
	@Autowired
	protected StarPlayerRepository starPlayerRepository;
	public StarPlayer add(StarPlayer ability) {
		return starPlayerRepository.save(ability);
	}
	
	public List<StarPlayer> findAll(){
		return starPlayerRepository.findAll();
	}
	
	public StarPlayer find(String id){
		return starPlayerRepository.findOne(id);
	}

}
