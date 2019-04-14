
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.YearStateTarget;
import org.springframework.data.mongodb.repository.Query;

public interface YearStateTargetRepo extends MongoRepository<YearStateTarget, InnerId> {
    @Query(value = "{\"_id.year\":?0," +
            " \"_id.country\":?1," +
            " \"_id.targtype\":{$in:?2}}",sort = "{ _id : 1 }")
    List<View> findByTargetTypes(
            Integer year, String country, List<Integer> types
    );
}