package com.pitt.mysql.repository;

import com.pitt.mysql.entity.YearCountryAtt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface YearCountryAttRepos extends JpaRepository<YearCountryAtt, UUID> {
    List<YearCountryAtt> findAllByRegionAndYearAndAttacktype1In(String region, int year, List<Integer> types);
}
