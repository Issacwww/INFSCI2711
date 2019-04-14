package com.pitt.mysql.repository;

import com.pitt.mysql.entity.DayCountry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DayCountryRepos extends JpaRepository<DayCountry, UUID> {
    List<DayCountry> findAllByCountryAndYearAndMonth(String country, int year, int month);
}
