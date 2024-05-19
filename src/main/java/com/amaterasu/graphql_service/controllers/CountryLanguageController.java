package com.amaterasu.graphql_service.controllers;

import com.amaterasu.graphql_service.entities.Country;
import com.amaterasu.graphql_service.entities.CountryLanguage;
import com.amaterasu.graphql_service.service.CountryLanguageService;
import com.amaterasu.graphql_service.service.CountryService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CountryLanguageController {


    private final CountryLanguageService countryLanguageService;

    public CountryLanguageController(CountryLanguageService countryLanguageService) {
        this.countryLanguageService = countryLanguageService;
    }


    @QueryMapping
    public List<CountryLanguage> countryLanguages(@Argument String countryCode) {
        return countryLanguageService.getCountryLanguage(countryCode);
    }

    @QueryMapping
    public List<CountryLanguage> languages() {
        return countryLanguageService.getAllCountryLanguages();
    }
}
