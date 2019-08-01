package com.codegym.FinalExam.repository;

import com.codegym.FinalExam.model.City;
import com.codegym.FinalExam.model.Country;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CityRepository extends PagingAndSortingRepository<City, Long> {
    Iterable<City> findAllByCountry(Country country);

}
