package com.amaterasu.graphql_service.controllers;

import com.amaterasu.graphql_service.entities.City;
import com.amaterasu.graphql_service.entities.Country;
import com.amaterasu.graphql_service.service.CityService;
import com.amaterasu.graphql_service.service.CountryService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CityController {


    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }


    @QueryMapping
    public List<City> countryCities(@Argument String countryCode) {
        return cityService.getCitiesByCountryCode(countryCode);
    }

    @QueryMapping
    public City city(@Argument Integer id) {
        return cityService.getCity(id);
    }

    @QueryMapping
    public List<City> cities() {
        return cityService.getAllCities();
    }
}

