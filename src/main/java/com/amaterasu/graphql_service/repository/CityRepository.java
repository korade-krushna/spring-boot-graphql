package com.amaterasu.graphql_service.repository;

import com.amaterasu.graphql_service.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

    List<City> findByCountryCode(String countryCode);
}
