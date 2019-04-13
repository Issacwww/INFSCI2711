
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.YearState;

public interface YearStateRepo extends MongoRepository<YearState, InnerId> {
    List<View> getAllById_YearAndId_CountryOrderById(Integer year, String country);
}