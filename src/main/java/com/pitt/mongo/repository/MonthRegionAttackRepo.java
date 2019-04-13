
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.MonthRegionAttack;

public interface MonthRegionAttackRepo extends MongoRepository<MonthRegionAttack, InnerId> {

    List<View> getAllById_YearAndId_RegionOrderById(Integer year, String region);
}