package com.pitt.mysql.repository;

import com.pitt.mysql.entity.MonthCountryAtt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MonthCountryAttRepos extends JpaRepository<MonthCountryAtt, UUID> {
    List<MonthCountryAtt> findAllByCountryAndYearAndAttacktype1In(String country, int year, List<Integer> types);
    List<MonthCountryAtt> findAllByRegionAndYearAndMonthAndAttacktype1In(String Region, int year, int month, List<Integer> types);
}
