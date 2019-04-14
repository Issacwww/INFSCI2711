package com.pitt.mysql.repository;

import com.pitt.mysql.entity.DayRegion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DayRegionRepos extends JpaRepository<DayRegion, UUID> {
    List<DayRegion> findAllByRegionAndYearAndMonth(String region, int year, int month);
}
