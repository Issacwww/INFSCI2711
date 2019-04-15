package com.pitt.mysql.repository;

import com.pitt.mysql.entity.YearCountryTarg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface YearCountryTargRepos extends JpaRepository<YearCountryTarg, UUID> {
    List<YearCountryTarg> findAllByRegionAndYearAndTargettype1In(String region, int year, List<Integer> types);
}
