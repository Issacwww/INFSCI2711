package com.pitt.mysql.repository;

import com.pitt.mysql.entity.MonthProvstateWeap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MonthStateWeapRepos extends JpaRepository<MonthProvstateWeap, UUID> {
    List<MonthProvstateWeap> findAllByCountryAndProvstateAndYearAndWeaptype1In(String country, String state, int year, List<Integer> types);
    List<MonthProvstateWeap> findAllByCountryAndYearAndWeaptype1In(String country,int year,List<Integer> types);
}
