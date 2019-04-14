
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.MonthCountryTarget;
import org.springframework.data.mongodb.repository.Query;

public interface MonthCountryTargetRepo extends MongoRepository<MonthCountryTarget, InnerId> {
    @Query(value = "{\"_id.year\":?0," +
            " \"_id.country\":?1," +
            " \"_id.targtype\":{$in:?2}}",sort = "{ _id : 1 }")
    List<View> findByTargetTypes(
            Integer year, String country, List<Integer> types
    );

    @Query(value = "{\"_id.year\":?0," +
            " \"_id.month\":?1," +
            " \"_id.region\":?2," +
            " \"_id.targtype\":{$in:?3}}",sort = "{ _id : 1 }")
    List<View> findByTargetTypes(Integer year, Integer month, String region, List<Integer> types);
}