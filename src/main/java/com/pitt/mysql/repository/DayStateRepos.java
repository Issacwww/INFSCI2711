package com.pitt.mysql.repository;

import com.pitt.mysql.entity.DayProvstate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DayStateRepos extends JpaRepository<DayProvstate, UUID> {
    List<DayProvstate> findAllByYearAndMonthAndCountryAndProvstate(int year, int month, String country, String state);
}
