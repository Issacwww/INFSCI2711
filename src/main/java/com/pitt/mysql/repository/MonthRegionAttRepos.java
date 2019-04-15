package com.pitt.mysql.repository;

import com.pitt.mysql.entity.MonthRegionAtt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MonthRegionAttRepos extends JpaRepository<MonthRegionAtt, UUID> {
    List<MonthRegionAtt> findAllByRegionAndYearAndAttacktypeIn(String region, int year, List<Integer> types);
}
