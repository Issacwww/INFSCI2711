
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.YearStateAttack;
import org.springframework.data.mongodb.repository.Query;

public interface YearStateAttackRepo extends MongoRepository<YearStateAttack, InnerId> {
    List<View> getAllById_YearAndId_CountryOrderById(int year, String country);
    @Query(value = "{\"_id.year\":?0," +
            " \"_id.country\":?1," +
            " \"_id.attacktype\":{$in:?2}}",sort = "{ _id : 1 }")
    List<View> findByAttackTypes(
            int year, String country, List types
    );
}