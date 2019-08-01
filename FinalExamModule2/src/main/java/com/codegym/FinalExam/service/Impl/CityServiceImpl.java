package com.codegym.FinalExam.service.Impl;

import com.codegym.FinalExam.model.City;
import com.codegym.FinalExam.model.Country;
import com.codegym.FinalExam.repository.CityRepository;
import com.codegym.FinalExam.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;

public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;

    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findById(Long id) {
        return cityRepository.findOne(id);
    }

    @Override
    public void save(City city) {
        cityRepository.save(city);

    }

    @Override
    public void remove(Long id) {
        cityRepository.delete(id);

    }

    @Override
    public Iterable<City> findAllByCountry(Country country) {
        return cityRepository.findAllByCountry(country);
    }


}
