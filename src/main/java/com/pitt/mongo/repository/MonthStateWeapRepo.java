
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.MonthStateWeap;
import org.springframework.data.mongodb.repository.Query;

public interface MonthStateWeapRepo extends MongoRepository<MonthStateWeap, InnerId> {

    @Query(value = "{\"_id.year\":?0," +
            " \"_id.country\":?1," +
            " \"_id.provstate\":?2," +
            " \"_id.weaptype\":{$in:?3}}",sort = "{ _id : 1 }")
    List<View> findByWeapTypes(Integer year, String country, String state, List<Integer> types);

    @Query(value = "{\"_id.year\":?0," +
            " \"_id.month\":?1," +
            " \"_id.country\":?2," +
            " \"_id.weaptype\":{$in:?3}}",sort = "{ _id : 1 }")
    List<View> findByWeapTypes(Integer year, Integer month, String country, List<Integer> types);

}