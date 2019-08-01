package com.codegym.FinalExam.service;

import com.codegym.FinalExam.model.City;
import com.codegym.FinalExam.model.Country;

public interface CityService {
    Iterable<City> findAll();
    City findById(Long id);
    void save(City city);
    void remove(Long id);

    Iterable<City> findAllByCountry(Country country);
}
