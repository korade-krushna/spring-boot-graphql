package com.amaterasu.graphql_service.service;

import com.amaterasu.graphql_service.entities.City;
import com.amaterasu.graphql_service.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }


    public List<City> getCitiesByCountryCode(String countryCode) {
        return cityRepository.findByCountryCode(countryCode);
    }


    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public City getCity(Integer id) {
        return cityRepository.findById(id).orElse(null);
    }
}
