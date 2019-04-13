
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.MonthCountryAttack;
import org.springframework.data.mongodb.repository.Query;

public interface MonthCountryAttackRepo extends MongoRepository<MonthCountryAttack, InnerId> {
    List<View> getAllById_YearAndId_CountryOrderById(int year, String country);
//    @Query(value = "db.month_region_attack.find({\"_id.year\":2016,\"_id.region\":\"Middle East & North Africa\"})\n")
    List<View> getAllBy();
}