package com.pitt.mysql.repository;

import com.pitt.mysql.entity.YearProvstate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface YearStateRepos extends JpaRepository<YearProvstate, UUID> {
    List<YearProvstate> findAllByCountryAndYear(String country, int year);
}
