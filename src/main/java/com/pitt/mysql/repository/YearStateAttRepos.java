package com.pitt.mysql.repository;

import com.pitt.mysql.entity.YearProvstateAtt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface YearStateAttRepos extends JpaRepository<YearProvstateAtt, UUID> {
    List<YearProvstateAtt> findAllByCountryAndYearAndAttacktype1In(String country, int year, List<Integer> types);
}
