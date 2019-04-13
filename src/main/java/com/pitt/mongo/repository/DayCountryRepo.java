
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.DayCountry;

public interface DayCountryRepo extends MongoRepository<DayCountry, InnerId> {
    List<View> getAllById_YearAndId_MonthAndId_CountryOrderById(
            int year, int month, String country
    );
}