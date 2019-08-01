package com.codegym.FinalExam.repository;

import com.codegym.FinalExam.model.Country;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {
}
