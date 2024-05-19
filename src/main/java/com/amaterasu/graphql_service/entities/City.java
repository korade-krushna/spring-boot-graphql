package com.amaterasu.graphql_service.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "country_code")
    private String countryCode;
    @Column(name = "district")
    private String district;
    @Column(name = "population")
    private int population;
}
