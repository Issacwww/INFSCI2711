package com.pitt.mysql.repository;

import com.pitt.mysql.entity.MonthCountry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MonthCountryRepos extends JpaRepository<MonthCountry, UUID> {
    List<MonthCountry> findAllByCountryAndYear(String country, int year);
}
