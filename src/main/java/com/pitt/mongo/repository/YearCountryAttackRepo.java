
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.YearCountryAttack;
import org.springframework.data.mongodb.repository.Query;

public interface YearCountryAttackRepo extends MongoRepository<YearCountryAttack, InnerId> {
    @Query(value = "{\"_id.year\":?0," +
            " \"_id.region\":?1," +
            " \"_id.attacktype\":{$in:?2}}",sort = "{ _id : 1 }")
    List<View> findByAttackTypes(
            int year, String region, List types
    );
}