
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.DayRegion;

public interface DayRegionRepo extends MongoRepository<DayRegion, InnerId> {
    List<View> getAllById_YearAndId_MonthAndId_RegionOrderById(
            int year, int month, String region
    );
}