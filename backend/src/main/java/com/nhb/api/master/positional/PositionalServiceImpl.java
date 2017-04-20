package com.nhb.api.master.positional;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PositionalServiceImpl implements PositionalService{
	@Autowired
	protected PositionalRepository positionalRepository;
	public Positional add(Positional positional) {
		return positionalRepository.save(positional);
	}
	
	public List<Positional> findAll(){
		List<Positional> list = new ArrayList<Positional>();
		positionalRepository.findAll().forEach(list::add);
		return list;
	}
	
	public Page<Positional> findAll(Pageable page){
		return positionalRepository.findAll(page);
	}
	
	public Positional find(String id){
		return positionalRepository.findOne(id);
	}

}
