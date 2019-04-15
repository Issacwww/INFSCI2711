package com.pitt.mysql.repository;

import com.pitt.mysql.entity.MonthCountryTarg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MonthCountryTargRepos extends JpaRepository<MonthCountryTarg, UUID> {
    List<MonthCountryTarg> findAllByCountryAndYearAndTargetypeIn(String country, int year, List<Integer> types);
    List<MonthCountryTarg> findAllByRegionAndYearAndTargetypeIn(String region, int year, List<Integer> types);
}
