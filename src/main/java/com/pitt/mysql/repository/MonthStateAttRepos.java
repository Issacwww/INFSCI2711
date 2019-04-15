package com.pitt.mysql.repository;

import com.pitt.mysql.entity.MonthProvstateAtt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface MonthStateAttRepos extends JpaRepository<MonthProvstateAtt, UUID> {
//    @Query(value = "SELECT  '*' from MonthProvstateAtt where country = ?1 and provstate = ?2 and year = ?3 ")
    List<MonthProvstateAtt> findAllByCountryAndProvstateAndYearAndAttacktypeIn(String country, String state, int year, List<Integer> type);
    List<MonthProvstateAtt> findAllByCountryAndYearAndMonthAndAttacktypeIn(String country, int year, int month, List<Integer> type);
}
