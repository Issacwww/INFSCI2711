package com.pitt.mysql.repository;

import com.pitt.mysql.entity.MonthProvstate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface MonthStateRepos extends JpaRepository<MonthProvstate, UUID> {
    List<MonthProvstate> findAllByYearAndProvstateAndCountry(int year, String state, String country);
}
