package com.pitt.mysql.repository;

import com.pitt.mysql.entity.MonthRegion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MonthRegionRepos extends JpaRepository<MonthRegion, UUID> {
    List<MonthRegion> findAllByRegionAndYear(String region, int year);
}
