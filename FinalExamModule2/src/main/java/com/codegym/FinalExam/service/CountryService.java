package com.codegym.FinalExam.service;

import com.codegym.FinalExam.model.Country;

public interface CountryService {
    Iterable<Country> findAll();
    Country findById(Long id);
    void save(Country country);
    void remove(Long id);
}
