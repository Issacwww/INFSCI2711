
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.YearStateAttack;

public interface YearStateAttackRepo extends MongoRepository<YearStateAttack, InnerId> {
    List<View> getAllById_YearAndId_CountryOrderById(int year, String country);
}