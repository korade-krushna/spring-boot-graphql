package com.amaterasu.graphql_service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {
    @Column(name = "country_code")
    @Id
    private String countryCode;
    @Column(name = "language")
    private String language;
    @Column(name = "is_official")
    private String isOfficial;
    @Column(name = "percentage")
    private Double percentage;
}
