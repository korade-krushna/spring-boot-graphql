package com.amaterasu.graphql_service.service;

import com.amaterasu.graphql_service.entities.Country;
import com.amaterasu.graphql_service.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country getCountryByName(String name) {
        return countryRepository.findByName(name).orElse(null);
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
