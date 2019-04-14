
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.MonthCountryWeap;
import org.springframework.data.mongodb.repository.Query;

public interface MonthCountryWeapRepo extends MongoRepository<MonthCountryWeap, InnerId> {

    @Query(value = "{\"_id.year\":?0," +
            " \"_id.country\":?1," +
            " \"_id.weaptype\":{$in:?2}}",sort = "{ _id : 1 }")
    List<View> findByWeapTypes(Integer year, String country, List<Integer> types);

    @Query(value = "{\"_id.year\":?0," +
            " \"_id.month\":?1," +
            " \"_id.region\":?2," +
            " \"_id.weaptype\":{$in:?3}}",sort = "{ _id : 1 }")
    List<View> findByWeapTypes(Integer year, Integer month, String region, List<Integer> types);
}