package com.amaterasu.graphql_service.repository;

import com.amaterasu.graphql_service.entities.CountryLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, String> {
    List<CountryLanguage> findByCountryCode(String countryCode);
}
