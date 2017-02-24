package com.nhb.api.master.race;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RaceRepository extends MongoRepository<Race, String>{
	public Race findByName(String name);
}
