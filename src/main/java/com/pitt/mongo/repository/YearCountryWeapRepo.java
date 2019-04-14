
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.YearCountryWeap;
import org.springframework.data.mongodb.repository.Query;

public interface YearCountryWeapRepo extends MongoRepository<YearCountryWeap, InnerId> {

    @Query(value = "{\"_id.year\":?0," +
            " \"_id.region\":?1," +
            " \"_id.weaptype\":{$in:?2}}",sort = "{ _id : 1 }")
    List<View> findByWeapTypes(Integer year, String region, List<Integer> types);
}