
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.MonthRegion;

public interface MonthRegionRepo extends MongoRepository<MonthRegion, InnerId> {
    List<View> getAllById_YearAndId_RegionOrderById(int year, String region);
}