package com.pitt.mysql.repository;

import com.pitt.mysql.entity.YearCountryWeap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface YearCountryWeapRepos extends JpaRepository<YearCountryWeap, UUID> {
    List<YearCountryWeap> findAllByRegionAndYearAndWeaptypeIn(String region, int year, List<Integer> types);
}
