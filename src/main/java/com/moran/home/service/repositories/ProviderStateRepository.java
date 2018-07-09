package com.moran.home.service.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moran.home.service.entity.master.StateProvince;

public interface ProviderStateRepository extends CrudRepository<StateProvince, Integer> {

}
