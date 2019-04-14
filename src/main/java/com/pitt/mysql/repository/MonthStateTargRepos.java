package com.pitt.mysql.repository;

import com.pitt.mysql.entity.MonthProvstateTarg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MonthStateTargRepos extends JpaRepository<MonthProvstateTarg, UUID> {
    List<MonthProvstateTarg> findAllByCountryAndProvstateAndYearAndTargettype1In(String country, String state, int year, List<Integer> types);
    List<MonthProvstateTarg> findAllByCountryAndYearAndTargettype1In(String country, int year, List<Integer> types);
}
