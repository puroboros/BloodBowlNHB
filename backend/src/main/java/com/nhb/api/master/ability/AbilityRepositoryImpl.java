package com.nhb.api.master.ability;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class AbilityRepositoryImpl implements AbilityRepositoryCustom {
	@Autowired
	private MongoOperations mongoTemplate;

	@Override
	public Page<Ability> find(String abilityID, String abilityName, String abilityTypeName, Pageable page) {
		Query query = new Query();
		
		query.with(page);
		if (abilityID != null) {
			query.addCriteria(Criteria.where("id").is(abilityID));
		}
		if (abilityName != null) {
			query.addCriteria(Criteria.where("name")
					.regex(Pattern.compile(abilityName, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE)));
		}
		if (abilityTypeName != null) {
			query.addCriteria(Criteria.where("abilityType.name")
					.regex(Pattern.compile(abilityTypeName, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE)));
		}
		Page<Ability> results;
		results = getResults(query, page);
		return results;
	}

	private Page<Ability> getResults(Query query, Pageable pageRequest) {
		Page<Ability> results;
		List<Ability> list = null;
		long total = mongoTemplate.count(query, Ability.class);
		list = mongoTemplate.find(query, Ability.class);
		results = new PageImpl<Ability>(list, pageRequest, total);
		return results;
	}

}
