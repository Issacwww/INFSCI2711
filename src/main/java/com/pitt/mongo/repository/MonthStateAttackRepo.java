
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.MonthStateAttack;
import org.springframework.data.mongodb.repository.Query;

public interface MonthStateAttackRepo extends MongoRepository<MonthStateAttack, InnerId> {
    /*
    ({"_id.year":?0,
    "_id.country":?1,
    "_id.provstate":?2,
    "_id.attacktype":{$in:?3}})
     */
    @Query(value = "{\"_id.year\":?0," +
            " \"_id.country\":?1," +
            " \"_id.provstate\":?2," +
            " \"_id.attacktype\":{$in:?3}}",sort = "{ _id : 1 }")
    List<View> findByAttackTypes(
            int year, String country, String state, List types
    );

    @Query(value = "{\"_id.year\":?0," +
            " \"_id.month\":?1," +
            " \"_id.country\":?2," +
            " \"_id.attacktype\":{$in:?3}}",sort = "{ _id : 1 }")
    List<View> findByAttackTypes(Integer year,Integer month, String country, List<Integer> types);
}