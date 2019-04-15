package com.pitt.mysql.repository;

import com.pitt.mysql.entity.YearCountry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface YearCountryRepos extends JpaRepository<YearCountry, UUID> {
    List<YearCountry> findAllByRegionAndYear(String region, int year);
}
