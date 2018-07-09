package com.moran.home.service.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moran.home.service.entity.master.CityTownVillage;

public interface ProviderCityRepository extends CrudRepository<CityTownVillage, Integer> {

}
