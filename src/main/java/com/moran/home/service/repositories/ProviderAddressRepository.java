package com.moran.home.service.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moran.home.service.entity.provider.Address;

public interface ProviderAddressRepository extends CrudRepository<Address, Integer> {

}
