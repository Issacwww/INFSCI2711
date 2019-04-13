
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.YearCountry;

public interface YearCountryRepo extends MongoRepository<YearCountry, InnerId> {

    List<View> getAllById_YearAndId_RegionOrderById(Integer year, String region);
}