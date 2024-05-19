package com.amaterasu.graphql_service.resolvers;

import com.amaterasu.graphql_service.entities.Country;
import com.amaterasu.graphql_service.service.CountryService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CountryResolver {


    private final CountryService countryService;

    public CountryResolver(CountryService countryService) {
        this.countryService = countryService;
    }

    @QueryMapping
    public Country country(@Argument String name) {
        return countryService.getCountryByName(name);
    }

    @QueryMapping
    public List<Country> countries() {
        return countryService.getAllCountries();
    }
}
