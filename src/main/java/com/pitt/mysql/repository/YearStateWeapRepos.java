package com.pitt.mysql.repository;

import com.pitt.mysql.entity.YearProvstateWeap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface YearStateWeapRepos extends JpaRepository<YearProvstateWeap, UUID> {
    List<YearProvstateWeap> findAllByCountryAndYearAndWeaptypeIn(String country, int year, List<Integer> types);
}
