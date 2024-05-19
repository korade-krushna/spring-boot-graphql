package com.amaterasu.graphql_service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "country")
public class Country {
    @Column(name = "code")
    @Id
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "continent")
    private String continent;
    @Column(name = "region")
    private String region;
    @Column(name = "surface_area")
    private Double surfaceArea;
    @Column(name = "indep_year")
    private Integer indepYear;
    @Column(name = "population")
    private Integer population;
    @Column(name = "life_expectancy")
    private Double lifeExpectancy;
    @Column(name = "gnp")
    private Double gnp;
    @Column(name = "gnp_old")
    private Double gnpOld;
    @Column(name = "local_name")
    private String localName;
    @Column(name = "government_form")
    private String governmentForm;
    @Column(name = "head_of_state")
    private String headOfState;
    @Column(name = "capital")
    private Integer capital;
    @Column(name = "code2")
    private String code2;
}
