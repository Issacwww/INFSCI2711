
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.DayState;

public interface DayStateRepo extends MongoRepository<DayState, InnerId> {
    List<View> getAllById_YearAndId_MonthAndId_CountryAndId_ProvstateOrderById(
            int year,int month,String country,String state
    );
}