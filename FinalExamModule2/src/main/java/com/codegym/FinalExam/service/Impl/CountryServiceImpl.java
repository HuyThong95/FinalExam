package com.codegym.FinalExam.service.Impl;

import com.codegym.FinalExam.model.Country;
import com.codegym.FinalExam.repository.CountryRepository;
import com.codegym.FinalExam.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;

public class CountryServiceImpl implements CountryService {
    @Autowired
    public CountryRepository countryRepository;


    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country findById(Long id) {
        return countryRepository.findOne(id);
    }

    @Override
    public void save(Country country) {
        countryRepository.save(country);

    }

    @Override
    public void remove(Long id) {
        countryRepository.delete(id);

    }
}
