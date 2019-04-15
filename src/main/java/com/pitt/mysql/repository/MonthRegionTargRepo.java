package com.pitt.mysql.repository;

import com.pitt.mysql.entity.MonthRegionTarg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MonthRegionTargRepo extends JpaRepository<MonthRegionTarg, UUID> {
    List<MonthRegionTarg> findAllByRegionAndYearAndTargetypeIn(String region, int year, List<Integer> types);
}
