package com.amaterasu.graphql_service.repository;

import com.amaterasu.graphql_service.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    Optional<Country> findByName(String name);
}
