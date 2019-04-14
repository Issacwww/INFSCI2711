package com.pitt.mysql.repository;

import com.pitt.mysql.entity.YearProvstateTarg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface YearStateTargRepos extends JpaRepository<YearProvstateTarg, UUID> {
    List<YearProvstateTarg> findAllByCountryAndYearAndTargettype1In(String country, int year, List<Integer> types);
}
