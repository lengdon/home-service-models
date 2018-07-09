package com.moran.home.service.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moran.home.service.entity.master.Country;

public interface ProviderCountryRepository extends CrudRepository<Country, Integer> {

}
