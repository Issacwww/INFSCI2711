package com.pitt.mysql.repository;

import com.pitt.mysql.entity.MonthCountryWeap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MonthCountryWeapRepos extends JpaRepository<MonthCountryWeap, UUID> {
    List<MonthCountryWeap> findAllByCountryAndYearAndWeaptype1In(String country, int year, List<Integer> types);
    List<MonthCountryWeap> findAllByRegionAndYearAndWeaptype1In(String region, int year, List<Integer> types);
}
