
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.MonthRegionAttack;
import org.springframework.data.mongodb.repository.Query;

public interface MonthRegionAttackRepo extends MongoRepository<MonthRegionAttack, InnerId> {

    List<View> getAllById_YearAndId_RegionOrderById(Integer year, String region);

    @Query(value = "{\"_id.year\":?0," +
            " \"_id.region\":?1," +
            " \"_id.attacktype\":{$in:?2}}",sort = "{ _id : 1 }")
    List<View> findByAttackTypes(
            int year, String region, List types
    );
}