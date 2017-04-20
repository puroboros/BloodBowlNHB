package com.nhb.api.master.race;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RaceRepository extends PagingAndSortingRepository<Race, String>{
	public Race findByName(String name);
	public Page<Race> findByNameContainingIgnoreCase(String name, Pageable page);
}
