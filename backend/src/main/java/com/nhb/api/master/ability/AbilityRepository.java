package com.nhb.api.master.ability;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface AbilityRepository extends PagingAndSortingRepository<Ability, String>, AbilityRepositoryCustom{

}
