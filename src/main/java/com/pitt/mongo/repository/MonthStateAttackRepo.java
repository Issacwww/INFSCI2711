
package com.pitt.mongo.repository;

import java.util.List;

import com.pitt.mongo.entity.View;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.MonthStateAttack;

public interface MonthStateAttackRepo extends MongoRepository<MonthStateAttack, InnerId> {
    List<View> getAllById_YearAndId_CountryAndId_ProvstateOrderById(
            int year, String country, String state
    );
}