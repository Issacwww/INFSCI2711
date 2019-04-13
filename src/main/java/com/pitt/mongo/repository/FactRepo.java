package com.pitt.mongo.repository;

import com.pitt.mongo.entity.Fact;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FactRepo extends MongoRepository<Fact,Long> {
    List<Fact> findFactsByYearAndMonthAndDayAndRegionAndCountryAndProvstateOrderById(int year, int month, int day,
                                                                               String Region, String Country, String Provstate);
    List<Fact> findFactsByYearAndMonthAndDay(int year, int month, int day);

    List<Fact> findFactsByYearAndMonth(int y, int m);

    List<Fact> findAllByYearOrderById(int y);
}
