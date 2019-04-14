
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.MonthRegionWeap;
import org.springframework.data.mongodb.repository.Query;

public interface MonthRegionWeapRepo extends MongoRepository<MonthRegionWeap, InnerId> {

    @Query(value = "{\"_id.year\":?0," +
            " \"_id.region\":?1," +
            " \"_id.waeptype\":{$in:?2}}",sort = "{ _id : 1 }")
    List<View> findByWeapTypes(Integer year, String region, List<Integer> types);
}