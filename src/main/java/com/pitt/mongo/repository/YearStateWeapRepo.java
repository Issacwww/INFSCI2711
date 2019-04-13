
package com.pitt.mongo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pitt.mongo.entity.InnerId;
import com.pitt.mongo.entity.YearStateWeap;

public interface YearStateWeapRepo extends MongoRepository<YearStateWeap, InnerId> {

}