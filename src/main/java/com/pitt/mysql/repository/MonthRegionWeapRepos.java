package com.pitt.mysql.repository;

import com.pitt.mysql.entity.MonthRegionWeap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MonthRegionWeapRepos extends JpaRepository<MonthRegionWeap, UUID> {
    List<MonthRegionWeap> findAllByRegionAndYearAndWeaptype1In(String region, int year, List<Integer> types);
}
