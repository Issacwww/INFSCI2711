
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.MonthState;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MonthStateRepo extends MongoRepository<MonthState, InnerId> {
    List<View> getAllById_YearAndId_CountryAndId_ProvstateOrderById(
            int year,String country,String state
    );
}