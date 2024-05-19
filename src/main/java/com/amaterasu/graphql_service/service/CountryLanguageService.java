package com.amaterasu.graphql_service.service;

import com.amaterasu.graphql_service.entities.Country;
import com.amaterasu.graphql_service.entities.CountryLanguage;
import com.amaterasu.graphql_service.repository.CountryLanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryLanguageService {

    private final CountryLanguageRepository countryLanguageRepository;

    public CountryLanguageService(CountryLanguageRepository countryLanguageRepository) {
        this.countryLanguageRepository = countryLanguageRepository;
    }

    public List<CountryLanguage> getCountryLanguage(String countryCode) {
        return countryLanguageRepository.findByCountryCode(countryCode);
    }

    public List<CountryLanguage> getAllCountryLanguages() {
        return countryLanguageRepository.findAll();
    }
}
